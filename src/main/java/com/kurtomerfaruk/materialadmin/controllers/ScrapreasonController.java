package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Scrapreason;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "scrapreasonController")
@ViewScoped
public class ScrapreasonController extends AbstractController<Scrapreason> {

    public ScrapreasonController() {
        // Inform the Abstract parent controller of the concrete Scrapreason Entity
        super(Scrapreason.class);
    }

}
