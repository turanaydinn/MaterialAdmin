package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Databaselog;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "databaselogController")
@ViewScoped
public class DatabaselogController extends AbstractController<Databaselog> {

    public DatabaselogController() {
        // Inform the Abstract parent controller of the concrete Databaselog Entity
        super(Databaselog.class);
    }

}
