package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Billofmaterials;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "billofmaterialsController")
@ViewScoped
public class BillofmaterialsController extends AbstractController<Billofmaterials> {

    public BillofmaterialsController() {
        // Inform the Abstract parent controller of the concrete Billofmaterials Entity
        super(Billofmaterials.class);
    }

}
