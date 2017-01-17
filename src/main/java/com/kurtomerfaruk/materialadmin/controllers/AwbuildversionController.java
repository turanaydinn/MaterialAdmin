package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Awbuildversion;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "awbuildversionController")
@ViewScoped
public class AwbuildversionController extends AbstractController<Awbuildversion> {

    public AwbuildversionController() {
        // Inform the Abstract parent controller of the concrete Awbuildversion Entity
        super(Awbuildversion.class);
    }

}
