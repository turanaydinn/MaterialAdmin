package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Product;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "productController")
@ViewScoped
public class ProductController extends AbstractController<Product> {

    public ProductController() {
        // Inform the Abstract parent controller of the concrete Product Entity
        super(Product.class);
    }

}
