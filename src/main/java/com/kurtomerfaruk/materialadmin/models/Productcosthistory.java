/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.materialadmin.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 17.01.2017 21:04:46
 */
@Entity
@Table(name = "productcosthistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productcosthistory.findAll", query = "SELECT p FROM Productcosthistory p"),
    @NamedQuery(name = "Productcosthistory.findByProductID", query = "SELECT p FROM Productcosthistory p WHERE p.productcosthistoryPK.productID = :productID"),
    @NamedQuery(name = "Productcosthistory.findByStartDate", query = "SELECT p FROM Productcosthistory p WHERE p.productcosthistoryPK.startDate = :startDate"),
    @NamedQuery(name = "Productcosthistory.findByEndDate", query = "SELECT p FROM Productcosthistory p WHERE p.endDate = :endDate"),
    @NamedQuery(name = "Productcosthistory.findByStandardCost", query = "SELECT p FROM Productcosthistory p WHERE p.standardCost = :standardCost"),
    @NamedQuery(name = "Productcosthistory.findByModifiedDate", query = "SELECT p FROM Productcosthistory p WHERE p.modifiedDate = :modifiedDate")})
public class Productcosthistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductcosthistoryPK productcosthistoryPK;
    @Column(name = "EndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StandardCost")
    private double standardCost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Productcosthistory() {
    }

    public Productcosthistory(ProductcosthistoryPK productcosthistoryPK) {
        this.productcosthistoryPK = productcosthistoryPK;
    }

    public Productcosthistory(ProductcosthistoryPK productcosthistoryPK, double standardCost, Date modifiedDate) {
        this.productcosthistoryPK = productcosthistoryPK;
        this.standardCost = standardCost;
        this.modifiedDate = modifiedDate;
    }

    public Productcosthistory(int productID, Date startDate) {
        this.productcosthistoryPK = new ProductcosthistoryPK(productID, startDate);
    }

    public ProductcosthistoryPK getProductcosthistoryPK() {
        return productcosthistoryPK;
    }

    public void setProductcosthistoryPK(ProductcosthistoryPK productcosthistoryPK) {
        this.productcosthistoryPK = productcosthistoryPK;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(double standardCost) {
        this.standardCost = standardCost;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productcosthistoryPK != null ? productcosthistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productcosthistory)) {
            return false;
        }
        Productcosthistory other = (Productcosthistory) object;
        if ((this.productcosthistoryPK == null && other.productcosthistoryPK != null) || (this.productcosthistoryPK != null && !this.productcosthistoryPK.equals(other.productcosthistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.materialadmin.models.Productcosthistory[ productcosthistoryPK=" + productcosthistoryPK + " ]";
    }

}
