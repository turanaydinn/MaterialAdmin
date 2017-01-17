package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Creditcard;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "creditcardController")
@ViewScoped
public class CreditcardController extends AbstractController<Creditcard> {

    public CreditcardController() {
        // Inform the Abstract parent controller of the concrete Creditcard Entity
        super(Creditcard.class);
    }

}
