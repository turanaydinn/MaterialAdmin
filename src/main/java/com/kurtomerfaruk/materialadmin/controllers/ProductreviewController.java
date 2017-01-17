package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Productreview;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productreviewController")
@ViewScoped
public class ProductreviewController extends AbstractController<Productreview> {

    public ProductreviewController() {
        // Inform the Abstract parent controller of the concrete Productreview Entity
        super(Productreview.class);
    }

}
