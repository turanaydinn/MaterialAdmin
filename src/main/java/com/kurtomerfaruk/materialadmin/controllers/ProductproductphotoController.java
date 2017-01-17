package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Productproductphoto;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productproductphotoController")
@ViewScoped
public class ProductproductphotoController extends AbstractController<Productproductphoto> {

    public ProductproductphotoController() {
        // Inform the Abstract parent controller of the concrete Productproductphoto Entity
        super(Productproductphoto.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductproductphotoPK(new com.kurtomerfaruk.materialadmin.models.ProductproductphotoPK());
    }

}
