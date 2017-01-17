package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Customer;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "customerController")
@ViewScoped
public class CustomerController extends AbstractController<Customer> {

    public CustomerController() {
        // Inform the Abstract parent controller of the concrete Customer Entity
        super(Customer.class);
    }

}
