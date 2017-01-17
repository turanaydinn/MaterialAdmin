package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Vendor;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "vendorController")
@ViewScoped
public class VendorController extends AbstractController<Vendor> {

    public VendorController() {
        // Inform the Abstract parent controller of the concrete Vendor Entity
        super(Vendor.class);
    }

}
