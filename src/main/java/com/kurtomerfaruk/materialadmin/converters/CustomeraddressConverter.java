package com.kurtomerfaruk.materialadmin.converters;

import com.kurtomerfaruk.materialadmin.models.Customeraddress;
import com.kurtomerfaruk.materialadmin.services.CustomeraddressFacade;
import com.kurtomerfaruk.materialadmin.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "customeraddressConverter")
public class CustomeraddressConverter implements Converter {

    @Inject
    private CustomeraddressFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.materialadmin.models.CustomeraddressPK getKey(String value) {
        com.kurtomerfaruk.materialadmin.models.CustomeraddressPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.kurtomerfaruk.materialadmin.models.CustomeraddressPK();
        key.setCustomerID(Integer.parseInt(values[0]));
        key.setAddressID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.materialadmin.models.CustomeraddressPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getCustomerID());
        sb.append(SEPARATOR);
        sb.append(value.getAddressID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Customeraddress) {
            Customeraddress o = (Customeraddress) object;
            return getStringKey(o.getCustomeraddressPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Customeraddress.class.getName()});
            return null;
        }
    }

}
