package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Productcategory;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productcategoryController")
@ViewScoped
public class ProductcategoryController extends AbstractController<Productcategory> {

    public ProductcategoryController() {
        // Inform the Abstract parent controller of the concrete Productcategory Entity
        super(Productcategory.class);
    }

}
