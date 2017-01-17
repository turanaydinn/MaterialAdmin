package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Address;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 17.01.2017 21:04:46
 */

@Named(value = "addressController")
@ViewScoped
public class AddressController extends AbstractController<Address> {

    private static final long serialVersionUID = -1728709862724625780L;

    public AddressController() {
        // Inform the Abstract parent controller of the concrete Address Entity
        super(Address.class);
    }

}
