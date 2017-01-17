package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Employeedepartmenthistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "employeedepartmenthistoryController")
@ViewScoped
public class EmployeedepartmenthistoryController extends AbstractController<Employeedepartmenthistory> {

    public EmployeedepartmenthistoryController() {
        // Inform the Abstract parent controller of the concrete Employeedepartmenthistory Entity
        super(Employeedepartmenthistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setEmployeedepartmenthistoryPK(new com.kurtomerfaruk.materialadmin.models.EmployeedepartmenthistoryPK());
    }

}
