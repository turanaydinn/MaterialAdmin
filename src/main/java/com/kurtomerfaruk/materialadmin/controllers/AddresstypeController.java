package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Addresstype;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "addresstypeController")
@ViewScoped
public class AddresstypeController extends AbstractController<Addresstype> {

    public AddresstypeController() {
        // Inform the Abstract parent controller of the concrete Addresstype Entity
        super(Addresstype.class);
    }

}
