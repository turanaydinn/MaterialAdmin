package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Shift;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "shiftController")
@ViewScoped
public class ShiftController extends AbstractController<Shift> {

    public ShiftController() {
        // Inform the Abstract parent controller of the concrete Shift Entity
        super(Shift.class);
    }

}
