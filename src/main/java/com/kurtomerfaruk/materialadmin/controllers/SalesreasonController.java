package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Salesreason;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "salesreasonController")
@ViewScoped
public class SalesreasonController extends AbstractController<Salesreason> {

    public SalesreasonController() {
        // Inform the Abstract parent controller of the concrete Salesreason Entity
        super(Salesreason.class);
    }

}
