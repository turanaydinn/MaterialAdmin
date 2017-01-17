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
 * Created on date 17.01.2017 21:04:43
 */
@Entity
@Table(name = "productproductphoto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productproductphoto.findAll", query = "SELECT p FROM Productproductphoto p"),
    @NamedQuery(name = "Productproductphoto.findByProductID", query = "SELECT p FROM Productproductphoto p WHERE p.productproductphotoPK.productID = :productID"),
    @NamedQuery(name = "Productproductphoto.findByProductPhotoID", query = "SELECT p FROM Productproductphoto p WHERE p.productproductphotoPK.productPhotoID = :productPhotoID"),
    @NamedQuery(name = "Productproductphoto.findByPrimary", query = "SELECT p FROM Productproductphoto p WHERE p.primary = :primary"),
    @NamedQuery(name = "Productproductphoto.findByModifiedDate", query = "SELECT p FROM Productproductphoto p WHERE p.modifiedDate = :modifiedDate")})
public class Productproductphoto implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductproductphotoPK productproductphotoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Primary")
    private boolean primary;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Productproductphoto() {
    }

    public Productproductphoto(ProductproductphotoPK productproductphotoPK) {
        this.productproductphotoPK = productproductphotoPK;
    }

    public Productproductphoto(ProductproductphotoPK productproductphotoPK, boolean primary, Date modifiedDate) {
        this.productproductphotoPK = productproductphotoPK;
        this.primary = primary;
        this.modifiedDate = modifiedDate;
    }

    public Productproductphoto(int productID, int productPhotoID) {
        this.productproductphotoPK = new ProductproductphotoPK(productID, productPhotoID);
    }

    public ProductproductphotoPK getProductproductphotoPK() {
        return productproductphotoPK;
    }

    public void setProductproductphotoPK(ProductproductphotoPK productproductphotoPK) {
        this.productproductphotoPK = productproductphotoPK;
    }

    public boolean getPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
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
        hash += (productproductphotoPK != null ? productproductphotoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productproductphoto)) {
            return false;
        }
        Productproductphoto other = (Productproductphoto) object;
        if ((this.productproductphotoPK == null && other.productproductphotoPK != null) || (this.productproductphotoPK != null && !this.productproductphotoPK.equals(other.productproductphotoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.materialadmin.models.Productproductphoto[ productproductphotoPK=" + productproductphotoPK + " ]";
    }

}
