package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Salesorderheader;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "salesorderheaderController")
@ViewScoped
public class SalesorderheaderController extends AbstractController<Salesorderheader> {

    public SalesorderheaderController() {
        // Inform the Abstract parent controller of the concrete Salesorderheader Entity
        super(Salesorderheader.class);
    }

}
