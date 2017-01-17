package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Currency;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "currencyController")
@ViewScoped
public class CurrencyController extends AbstractController<Currency> {

    public CurrencyController() {
        // Inform the Abstract parent controller of the concrete Currency Entity
        super(Currency.class);
    }

}
