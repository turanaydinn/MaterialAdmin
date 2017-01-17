package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Contactcreditcard;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "contactcreditcardController")
@ViewScoped
public class ContactcreditcardController extends AbstractController<Contactcreditcard> {

    public ContactcreditcardController() {
        // Inform the Abstract parent controller of the concrete Contactcreditcard Entity
        super(Contactcreditcard.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setContactcreditcardPK(new com.kurtomerfaruk.materialadmin.models.ContactcreditcardPK());
    }

}
