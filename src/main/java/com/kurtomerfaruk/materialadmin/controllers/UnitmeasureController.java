package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Unitmeasure;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "unitmeasureController")
@ViewScoped
public class UnitmeasureController extends AbstractController<Unitmeasure> {

    public UnitmeasureController() {
        // Inform the Abstract parent controller of the concrete Unitmeasure Entity
        super(Unitmeasure.class);
    }

}
