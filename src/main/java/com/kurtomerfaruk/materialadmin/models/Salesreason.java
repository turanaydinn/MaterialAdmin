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
 * Created on date 17.01.2017 21:04:43
 */
@Entity
@Table(name = "salesreason")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salesreason.findAll", query = "SELECT s FROM Salesreason s"),
    @NamedQuery(name = "Salesreason.findBySalesReasonID", query = "SELECT s FROM Salesreason s WHERE s.salesReasonID = :salesReasonID"),
    @NamedQuery(name = "Salesreason.findByName", query = "SELECT s FROM Salesreason s WHERE s.name = :name"),
    @NamedQuery(name = "Salesreason.findByReasonType", query = "SELECT s FROM Salesreason s WHERE s.reasonType = :reasonType"),
    @NamedQuery(name = "Salesreason.findByModifiedDate", query = "SELECT s FROM Salesreason s WHERE s.modifiedDate = :modifiedDate")})
public class Salesreason implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SalesReasonID")
    private Integer salesReasonID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ReasonType")
    private String reasonType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Salesreason() {
    }

    public Salesreason(Integer salesReasonID) {
        this.salesReasonID = salesReasonID;
    }

    public Salesreason(Integer salesReasonID, String name, String reasonType, Date modifiedDate) {
        this.salesReasonID = salesReasonID;
        this.name = name;
        this.reasonType = reasonType;
        this.modifiedDate = modifiedDate;
    }

    public Integer getSalesReasonID() {
        return salesReasonID;
    }

    public void setSalesReasonID(Integer salesReasonID) {
        this.salesReasonID = salesReasonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReasonType() {
        return reasonType;
    }

    public void setReasonType(String reasonType) {
        this.reasonType = reasonType;
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
        hash += (salesReasonID != null ? salesReasonID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salesreason)) {
            return false;
        }
        Salesreason other = (Salesreason) object;
        if ((this.salesReasonID == null && other.salesReasonID != null) || (this.salesReasonID != null && !this.salesReasonID.equals(other.salesReasonID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.materialadmin.models.Salesreason[ salesReasonID=" + salesReasonID + " ]";
    }

}
