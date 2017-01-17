package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Jobcandidate;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "jobcandidateController")
@ViewScoped
public class JobcandidateController extends AbstractController<Jobcandidate> {

    public JobcandidateController() {
        // Inform the Abstract parent controller of the concrete Jobcandidate Entity
        super(Jobcandidate.class);
    }

}
