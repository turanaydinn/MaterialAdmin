package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Errorlog;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "errorlogController")
@ViewScoped
public class ErrorlogController extends AbstractController<Errorlog> {

    public ErrorlogController() {
        // Inform the Abstract parent controller of the concrete Errorlog Entity
        super(Errorlog.class);
    }

}
