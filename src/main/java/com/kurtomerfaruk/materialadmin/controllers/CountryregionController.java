package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Countryregion;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "countryregionController")
@ViewScoped
public class CountryregionController extends AbstractController<Countryregion> {

    public CountryregionController() {
        // Inform the Abstract parent controller of the concrete Countryregion Entity
        super(Countryregion.class);
    }

}
