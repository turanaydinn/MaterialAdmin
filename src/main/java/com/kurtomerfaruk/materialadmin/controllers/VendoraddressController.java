package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Vendoraddress;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "vendoraddressController")
@ViewScoped
public class VendoraddressController extends AbstractController<Vendoraddress> {

    public VendoraddressController() {
        // Inform the Abstract parent controller of the concrete Vendoraddress Entity
        super(Vendoraddress.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setVendoraddressPK(new com.kurtomerfaruk.materialadmin.models.VendoraddressPK());
    }

}
