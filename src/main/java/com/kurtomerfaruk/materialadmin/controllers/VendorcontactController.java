package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Vendorcontact;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "vendorcontactController")
@ViewScoped
public class VendorcontactController extends AbstractController<Vendorcontact> {

    public VendorcontactController() {
        // Inform the Abstract parent controller of the concrete Vendorcontact Entity
        super(Vendorcontact.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setVendorcontactPK(new com.kurtomerfaruk.materialadmin.models.VendorcontactPK());
    }

}
