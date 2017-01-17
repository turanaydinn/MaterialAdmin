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
 * Created on date 17.01.2017 21:04:46
 */
@Entity
@Table(name = "creditcard")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Creditcard.findAll", query = "SELECT c FROM Creditcard c"),
    @NamedQuery(name = "Creditcard.findByCreditCardID", query = "SELECT c FROM Creditcard c WHERE c.creditCardID = :creditCardID"),
    @NamedQuery(name = "Creditcard.findByCardType", query = "SELECT c FROM Creditcard c WHERE c.cardType = :cardType"),
    @NamedQuery(name = "Creditcard.findByCardNumber", query = "SELECT c FROM Creditcard c WHERE c.cardNumber = :cardNumber"),
    @NamedQuery(name = "Creditcard.findByExpMonth", query = "SELECT c FROM Creditcard c WHERE c.expMonth = :expMonth"),
    @NamedQuery(name = "Creditcard.findByExpYear", query = "SELECT c FROM Creditcard c WHERE c.expYear = :expYear"),
    @NamedQuery(name = "Creditcard.findByModifiedDate", query = "SELECT c FROM Creditcard c WHERE c.modifiedDate = :modifiedDate")})
public class Creditcard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CreditCardID")
    private Integer creditCardID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CardType")
    private String cardType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "CardNumber")
    private String cardNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ExpMonth")
    private short expMonth;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ExpYear")
    private short expYear;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Creditcard() {
    }

    public Creditcard(Integer creditCardID) {
        this.creditCardID = creditCardID;
    }

    public Creditcard(Integer creditCardID, String cardType, String cardNumber, short expMonth, short expYear, Date modifiedDate) {
        this.creditCardID = creditCardID;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.modifiedDate = modifiedDate;
    }

    public Integer getCreditCardID() {
        return creditCardID;
    }

    public void setCreditCardID(Integer creditCardID) {
        this.creditCardID = creditCardID;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public short getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(short expMonth) {
        this.expMonth = expMonth;
    }

    public short getExpYear() {
        return expYear;
    }

    public void setExpYear(short expYear) {
        this.expYear = expYear;
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
        hash += (creditCardID != null ? creditCardID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Creditcard)) {
            return false;
        }
        Creditcard other = (Creditcard) object;
        if ((this.creditCardID == null && other.creditCardID != null) || (this.creditCardID != null && !this.creditCardID.equals(other.creditCardID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.materialadmin.models.Creditcard[ creditCardID=" + creditCardID + " ]";
    }

}
