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
import javax.validation.constraints.Size;

/**
 *
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 17.01.2017 21:04:43
 */
@Embeddable
public class CountryregioncurrencyPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "CountryRegionCode")
    private String countryRegionCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "CurrencyCode")
    private String currencyCode;

    public CountryregioncurrencyPK() {
    }

    public CountryregioncurrencyPK(String countryRegionCode, String currencyCode) {
        this.countryRegionCode = countryRegionCode;
        this.currencyCode = currencyCode;
    }

    public String getCountryRegionCode() {
        return countryRegionCode;
    }

    public void setCountryRegionCode(String countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryRegionCode != null ? countryRegionCode.hashCode() : 0);
        hash += (currencyCode != null ? currencyCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CountryregioncurrencyPK)) {
            return false;
        }
        CountryregioncurrencyPK other = (CountryregioncurrencyPK) object;
        if ((this.countryRegionCode == null && other.countryRegionCode != null) || (this.countryRegionCode != null && !this.countryRegionCode.equals(other.countryRegionCode))) {
            return false;
        }
        if ((this.currencyCode == null && other.currencyCode != null) || (this.currencyCode != null && !this.currencyCode.equals(other.currencyCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.materialadmin.models.CountryregioncurrencyPK[ countryRegionCode=" + countryRegionCode + ", currencyCode=" + currencyCode + " ]";
    }

}
