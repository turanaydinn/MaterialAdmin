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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 17.01.2017 21:04:45
 */
@Entity
@Table(name = "productmodel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productmodel.findAll", query = "SELECT p FROM Productmodel p"),
    @NamedQuery(name = "Productmodel.findByProductModelID", query = "SELECT p FROM Productmodel p WHERE p.productModelID = :productModelID"),
    @NamedQuery(name = "Productmodel.findByName", query = "SELECT p FROM Productmodel p WHERE p.name = :name"),
    @NamedQuery(name = "Productmodel.findByModifiedDate", query = "SELECT p FROM Productmodel p WHERE p.modifiedDate = :modifiedDate")})
public class Productmodel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProductModelID")
    private Integer productModelID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
    @Lob
    @Size(max = 65535)
    @Column(name = "CatalogDescription")
    private String catalogDescription;
    @Lob
    @Size(max = 65535)
    @Column(name = "Instructions")
    private String instructions;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "rowguid")
    private byte[] rowguid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Productmodel() {
    }

    public Productmodel(Integer productModelID) {
        this.productModelID = productModelID;
    }

    public Productmodel(Integer productModelID, String name, byte[] rowguid, Date modifiedDate) {
        this.productModelID = productModelID;
        this.name = name;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public Integer getProductModelID() {
        return productModelID;
    }

    public void setProductModelID(Integer productModelID) {
        this.productModelID = productModelID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalogDescription() {
        return catalogDescription;
    }

    public void setCatalogDescription(String catalogDescription) {
        this.catalogDescription = catalogDescription;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public byte[] getRowguid() {
        return rowguid;
    }

    public void setRowguid(byte[] rowguid) {
        this.rowguid = rowguid;
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
        hash += (productModelID != null ? productModelID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productmodel)) {
            return false;
        }
        Productmodel other = (Productmodel) object;
        if ((this.productModelID == null && other.productModelID != null) || (this.productModelID != null && !this.productModelID.equals(other.productModelID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.materialadmin.models.Productmodel[ productModelID=" + productModelID + " ]";
    }

}
