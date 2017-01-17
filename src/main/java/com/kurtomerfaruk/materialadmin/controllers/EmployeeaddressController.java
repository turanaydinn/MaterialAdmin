package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Employeeaddress;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "employeeaddressController")
@ViewScoped
public class EmployeeaddressController extends AbstractController<Employeeaddress> {

    public EmployeeaddressController() {
        // Inform the Abstract parent controller of the concrete Employeeaddress Entity
        super(Employeeaddress.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setEmployeeaddressPK(new com.kurtomerfaruk.materialadmin.models.EmployeeaddressPK());
    }

}
