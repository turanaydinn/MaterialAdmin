package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Salesterritoryhistory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "salesterritoryhistoryController")
@ViewScoped
public class SalesterritoryhistoryController extends AbstractController<Salesterritoryhistory> {

    public SalesterritoryhistoryController() {
        // Inform the Abstract parent controller of the concrete Salesterritoryhistory Entity
        super(Salesterritoryhistory.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSalesterritoryhistoryPK(new com.kurtomerfaruk.materialadmin.models.SalesterritoryhistoryPK());
    }

}
