package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Contacttype;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "contacttypeController")
@ViewScoped
public class ContacttypeController extends AbstractController<Contacttype> {

    public ContacttypeController() {
        // Inform the Abstract parent controller of the concrete Contacttype Entity
        super(Contacttype.class);
    }

}
