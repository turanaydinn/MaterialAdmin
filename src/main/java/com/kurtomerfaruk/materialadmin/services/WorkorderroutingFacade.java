/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.materialadmin.services;

import com.kurtomerfaruk.materialadmin.models.Workorderrouting;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 17.01.2017 21:07:10
 */
@Stateless
public class WorkorderroutingFacade extends AbstractFacade<Workorderrouting> {

    @PersistenceContext(unitName = "MATERIAL_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WorkorderroutingFacade() {
        super(Workorderrouting.class);
    }

}
