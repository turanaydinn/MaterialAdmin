package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Salesperson;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "salespersonController")
@ViewScoped
public class SalespersonController extends AbstractController<Salesperson> {

    public SalespersonController() {
        // Inform the Abstract parent controller of the concrete Salesperson Entity
        super(Salesperson.class);
    }

}
