package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Culture;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "cultureController")
@ViewScoped
public class CultureController extends AbstractController<Culture> {

    public CultureController() {
        // Inform the Abstract parent controller of the concrete Culture Entity
        super(Culture.class);
    }

}
