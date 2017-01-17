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
@Table(name = "transactionhistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transactionhistory.findAll", query = "SELECT t FROM Transactionhistory t"),
    @NamedQuery(name = "Transactionhistory.findByTransactionID", query = "SELECT t FROM Transactionhistory t WHERE t.transactionID = :transactionID"),
    @NamedQuery(name = "Transactionhistory.findByProductID", query = "SELECT t FROM Transactionhistory t WHERE t.productID = :productID"),
    @NamedQuery(name = "Transactionhistory.findByReferenceOrderID", query = "SELECT t FROM Transactionhistory t WHERE t.referenceOrderID = :referenceOrderID"),
    @NamedQuery(name = "Transactionhistory.findByReferenceOrderLineID", query = "SELECT t FROM Transactionhistory t WHERE t.referenceOrderLineID = :referenceOrderLineID"),
    @NamedQuery(name = "Transactionhistory.findByTransactionDate", query = "SELECT t FROM Transactionhistory t WHERE t.transactionDate = :transactionDate"),
    @NamedQuery(name = "Transactionhistory.findByTransactionType", query = "SELECT t FROM Transactionhistory t WHERE t.transactionType = :transactionType"),
    @NamedQuery(name = "Transactionhistory.findByQuantity", query = "SELECT t FROM Transactionhistory t WHERE t.quantity = :quantity"),
    @NamedQuery(name = "Transactionhistory.findByActualCost", query = "SELECT t FROM Transactionhistory t WHERE t.actualCost = :actualCost"),
    @NamedQuery(name = "Transactionhistory.findByModifiedDate", query = "SELECT t FROM Transactionhistory t WHERE t.modifiedDate = :modifiedDate")})
public class Transactionhistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TransactionID")
    private Integer transactionID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReferenceOrderID")
    private int referenceOrderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReferenceOrderLineID")
    private int referenceOrderLineID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TransactionDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TransactionType")
    private String transactionType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ActualCost")
    private double actualCost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Transactionhistory() {
    }

    public Transactionhistory(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public Transactionhistory(Integer transactionID, int productID, int referenceOrderID, int referenceOrderLineID, Date transactionDate, String transactionType, int quantity, double actualCost, Date modifiedDate) {
        this.transactionID = transactionID;
        this.productID = productID;
        this.referenceOrderID = referenceOrderID;
        this.referenceOrderLineID = referenceOrderLineID;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.quantity = quantity;
        this.actualCost = actualCost;
        this.modifiedDate = modifiedDate;
    }

    public Integer getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getReferenceOrderID() {
        return referenceOrderID;
    }

    public void setReferenceOrderID(int referenceOrderID) {
        this.referenceOrderID = referenceOrderID;
    }

    public int getReferenceOrderLineID() {
        return referenceOrderLineID;
    }

    public void setReferenceOrderLineID(int referenceOrderLineID) {
        this.referenceOrderLineID = referenceOrderLineID;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getActualCost() {
        return actualCost;
    }

    public void setActualCost(double actualCost) {
        this.actualCost = actualCost;
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
        hash += (transactionID != null ? transactionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transactionhistory)) {
            return false;
        }
        Transactionhistory other = (Transactionhistory) object;
        if ((this.transactionID == null && other.transactionID != null) || (this.transactionID != null && !this.transactionID.equals(other.transactionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.materialadmin.models.Transactionhistory[ transactionID=" + transactionID + " ]";
    }

}
