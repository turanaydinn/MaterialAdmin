package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Location;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "locationController")
@ViewScoped
public class LocationController extends AbstractController<Location> {

    public LocationController() {
        // Inform the Abstract parent controller of the concrete Location Entity
        super(Location.class);
    }

}
