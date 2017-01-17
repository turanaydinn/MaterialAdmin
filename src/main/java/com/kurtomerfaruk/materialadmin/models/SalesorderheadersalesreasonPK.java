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
 * Created on date 17.01.2017 21:04:45
 */
@Embeddable
public class SalesorderheadersalesreasonPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesOrderID")
    private int salesOrderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalesReasonID")
    private int salesReasonID;

    public SalesorderheadersalesreasonPK() {
    }

    public SalesorderheadersalesreasonPK(int salesOrderID, int salesReasonID) {
        this.salesOrderID = salesOrderID;
        this.salesReasonID = salesReasonID;
    }

    public int getSalesOrderID() {
        return salesOrderID;
    }

    public void setSalesOrderID(int salesOrderID) {
        this.salesOrderID = salesOrderID;
    }

    public int getSalesReasonID() {
        return salesReasonID;
    }

    public void setSalesReasonID(int salesReasonID) {
        this.salesReasonID = salesReasonID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) salesOrderID;
        hash += (int) salesReasonID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesorderheadersalesreasonPK)) {
            return false;
        }
        SalesorderheadersalesreasonPK other = (SalesorderheadersalesreasonPK) object;
        if (this.salesOrderID != other.salesOrderID) {
            return false;
        }
        if (this.salesReasonID != other.salesReasonID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.materialadmin.models.SalesorderheadersalesreasonPK[ salesOrderID=" + salesOrderID + ", salesReasonID=" + salesReasonID + " ]";
    }

}
