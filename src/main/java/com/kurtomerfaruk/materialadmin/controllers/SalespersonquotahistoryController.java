package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Salespersonquotahistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "salespersonquotahistoryController")
@ViewScoped
public class SalespersonquotahistoryController extends AbstractController<Salespersonquotahistory> {

    public SalespersonquotahistoryController() {
        // Inform the Abstract parent controller of the concrete Salespersonquotahistory Entity
        super(Salespersonquotahistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSalespersonquotahistoryPK(new com.kurtomerfaruk.materialadmin.models.SalespersonquotahistoryPK());
    }

}
