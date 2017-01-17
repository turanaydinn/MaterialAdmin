package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Contact;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "contactController")
@ViewScoped
public class ContactController extends AbstractController<Contact> {

    public ContactController() {
        // Inform the Abstract parent controller of the concrete Contact Entity
        super(Contact.class);
    }

}
