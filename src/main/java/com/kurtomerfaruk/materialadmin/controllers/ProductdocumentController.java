package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Productdocument;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productdocumentController")
@ViewScoped
public class ProductdocumentController extends AbstractController<Productdocument> {

    public ProductdocumentController() {
        // Inform the Abstract parent controller of the concrete Productdocument Entity
        super(Productdocument.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductdocumentPK(new com.kurtomerfaruk.materialadmin.models.ProductdocumentPK());
    }

}
