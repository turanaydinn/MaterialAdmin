package com.kurtomerfaruk.materialadmin.converters;

import com.kurtomerfaruk.materialadmin.models.Storecontact;
import com.kurtomerfaruk.materialadmin.services.StorecontactFacade;
import com.kurtomerfaruk.materialadmin.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "storecontactConverter")
public class StorecontactConverter implements Converter {

    @Inject
    private StorecontactFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.materialadmin.models.StorecontactPK getKey(String value) {
        com.kurtomerfaruk.materialadmin.models.StorecontactPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.kurtomerfaruk.materialadmin.models.StorecontactPK();
        key.setCustomerID(Integer.parseInt(values[0]));
        key.setContactID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.materialadmin.models.StorecontactPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getCustomerID());
        sb.append(SEPARATOR);
        sb.append(value.getContactID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Storecontact) {
            Storecontact o = (Storecontact) object;
            return getStringKey(o.getStorecontactPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Storecontact.class.getName()});
            return null;
        }
    }

}
