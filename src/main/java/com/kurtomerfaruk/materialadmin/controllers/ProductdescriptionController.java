package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Productdescription;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productdescriptionController")
@ViewScoped
public class ProductdescriptionController extends AbstractController<Productdescription> {

    public ProductdescriptionController() {
        // Inform the Abstract parent controller of the concrete Productdescription Entity
        super(Productdescription.class);
    }

}
