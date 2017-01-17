package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Productmodelproductdescriptionculture;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productmodelproductdescriptioncultureController")
@ViewScoped
public class ProductmodelproductdescriptioncultureController extends AbstractController<Productmodelproductdescriptionculture> {

    public ProductmodelproductdescriptioncultureController() {
        // Inform the Abstract parent controller of the concrete Productmodelproductdescriptionculture Entity
        super(Productmodelproductdescriptionculture.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setProductmodelproductdescriptionculturePK(new com.kurtomerfaruk.materialadmin.models.ProductmodelproductdescriptionculturePK());
    }

}
