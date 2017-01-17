package com.kurtomerfaruk.materialadmin.controllers;

import com.kurtomerfaruk.materialadmin.models.Department;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "departmentController")
@ViewScoped
public class DepartmentController extends AbstractController<Department> {

    public DepartmentController() {
        // Inform the Abstract parent controller of the concrete Department Entity
        super(Department.class);
    }

}
