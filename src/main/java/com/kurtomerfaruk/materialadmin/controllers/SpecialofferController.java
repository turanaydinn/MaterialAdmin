package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Specialoffer;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "specialofferController")
@ViewScoped
public class SpecialofferController extends AbstractController<Specialoffer> {

    public SpecialofferController() {
        // Inform the Abstract parent controller of the concrete Specialoffer Entity
        super(Specialoffer.class);
    }

}
