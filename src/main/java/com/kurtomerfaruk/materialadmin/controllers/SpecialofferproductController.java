package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Specialofferproduct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "specialofferproductController")
@ViewScoped
public class SpecialofferproductController extends AbstractController<Specialofferproduct> {

    public SpecialofferproductController() {
        // Inform the Abstract parent controller of the concrete Specialofferproduct Entity
        super(Specialofferproduct.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setSpecialofferproductPK(new com.kurtomerfaruk.materialadmin.models.SpecialofferproductPK());
    }

}
