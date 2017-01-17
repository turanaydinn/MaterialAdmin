package com.kurtomerfaruk.materialadmin.converters;

import com.kurtomerfaruk.materialadmin.models.Productvendor;
import com.kurtomerfaruk.materialadmin.services.ProductvendorFacade;
import com.kurtomerfaruk.materialadmin.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "productvendorConverter")
public class ProductvendorConverter implements Converter {

    @Inject
    private ProductvendorFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.materialadmin.models.ProductvendorPK getKey(String value) {
        com.kurtomerfaruk.materialadmin.models.ProductvendorPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.kurtomerfaruk.materialadmin.models.ProductvendorPK();
        key.setProductID(Integer.parseInt(values[0]));
        key.setVendorID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.materialadmin.models.ProductvendorPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getProductID());
        sb.append(SEPARATOR);
        sb.append(value.getVendorID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Productvendor) {
            Productvendor o = (Productvendor) object;
            return getStringKey(o.getProductvendorPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Productvendor.class.getName()});
            return null;
        }
    }

}
