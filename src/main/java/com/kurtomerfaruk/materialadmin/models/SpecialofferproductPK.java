/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.materialadmin.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 17.01.2017 21:04:44
 */
@Embeddable
public class SpecialofferproductPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "SpecialOfferID")
    private int specialOfferID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;

    public SpecialofferproductPK() {
    }

    public SpecialofferproductPK(int specialOfferID, int productID) {
        this.specialOfferID = specialOfferID;
        this.productID = productID;
    }

    public int getSpecialOfferID() {
        return specialOfferID;
    }

    public void setSpecialOfferID(int specialOfferID) {
        this.specialOfferID = specialOfferID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) specialOfferID;
        hash += (int) productID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpecialofferproductPK)) {
            return false;
        }
        SpecialofferproductPK other = (SpecialofferproductPK) object;
        if (this.specialOfferID != other.specialOfferID) {
            return false;
        }
        if (this.productID != other.productID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.materialadmin.models.SpecialofferproductPK[ specialOfferID=" + specialOfferID + ", productID=" + productID + " ]";
    }

}
