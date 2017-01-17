package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Store;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "storeController")
@ViewScoped
public class StoreController extends AbstractController<Store> {

    public StoreController() {
        // Inform the Abstract parent controller of the concrete Store Entity
        super(Store.class);
    }

}
