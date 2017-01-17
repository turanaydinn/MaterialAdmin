package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Shoppingcartitem;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "shoppingcartitemController")
@ViewScoped
public class ShoppingcartitemController extends AbstractController<Shoppingcartitem> {

    public ShoppingcartitemController() {
        // Inform the Abstract parent controller of the concrete Shoppingcartitem Entity
        super(Shoppingcartitem.class);
    }

}
