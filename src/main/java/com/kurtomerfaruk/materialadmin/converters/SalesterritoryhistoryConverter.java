package com.kurtomerfaruk.materialadmin.converters;

import com.kurtomerfaruk.materialadmin.models.Salesterritoryhistory;
import com.kurtomerfaruk.materialadmin.services.SalesterritoryhistoryFacade;
import com.kurtomerfaruk.materialadmin.controllers.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "salesterritoryhistoryConverter")
public class SalesterritoryhistoryConverter implements Converter {

    @Inject
    private SalesterritoryhistoryFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    com.kurtomerfaruk.materialadmin.models.SalesterritoryhistoryPK getKey(String value) {
        com.kurtomerfaruk.materialadmin.models.SalesterritoryhistoryPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new com.kurtomerfaruk.materialadmin.models.SalesterritoryhistoryPK();
        key.setSalesPersonID(Integer.parseInt(values[0]));
        key.setTerritoryID(Integer.parseInt(values[1]));
        key.setStartDate(java.sql.Date.valueOf(values[2]));
        return key;
    }

    String getStringKey(com.kurtomerfaruk.materialadmin.models.SalesterritoryhistoryPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getSalesPersonID());
        sb.append(SEPARATOR);
        sb.append(value.getTerritoryID());
        sb.append(SEPARATOR);
        sb.append(value.getStartDate());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Salesterritoryhistory) {
            Salesterritoryhistory o = (Salesterritoryhistory) object;
            return getStringKey(o.getSalesterritoryhistoryPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Salesterritoryhistory.class.getName()});
            return null;
        }
    }

}
