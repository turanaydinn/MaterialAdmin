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
 * Created on date 17.01.2017 21:04:46
 */
@Entity
@Table(name = "errorlog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Errorlog.findAll", query = "SELECT e FROM Errorlog e"),
    @NamedQuery(name = "Errorlog.findByErrorLogID", query = "SELECT e FROM Errorlog e WHERE e.errorLogID = :errorLogID"),
    @NamedQuery(name = "Errorlog.findByErrorTime", query = "SELECT e FROM Errorlog e WHERE e.errorTime = :errorTime"),
    @NamedQuery(name = "Errorlog.findByUserName", query = "SELECT e FROM Errorlog e WHERE e.userName = :userName"),
    @NamedQuery(name = "Errorlog.findByErrorNumber", query = "SELECT e FROM Errorlog e WHERE e.errorNumber = :errorNumber"),
    @NamedQuery(name = "Errorlog.findByErrorSeverity", query = "SELECT e FROM Errorlog e WHERE e.errorSeverity = :errorSeverity"),
    @NamedQuery(name = "Errorlog.findByErrorState", query = "SELECT e FROM Errorlog e WHERE e.errorState = :errorState"),
    @NamedQuery(name = "Errorlog.findByErrorProcedure", query = "SELECT e FROM Errorlog e WHERE e.errorProcedure = :errorProcedure"),
    @NamedQuery(name = "Errorlog.findByErrorLine", query = "SELECT e FROM Errorlog e WHERE e.errorLine = :errorLine")})
public class Errorlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ErrorLogID")
    private Integer errorLogID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ErrorTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date errorTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ErrorNumber")
    private int errorNumber;
    @Column(name = "ErrorSeverity")
    private Integer errorSeverity;
    @Column(name = "ErrorState")
    private Integer errorState;
    @Size(max = 126)
    @Column(name = "ErrorProcedure")
    private String errorProcedure;
    @Column(name = "ErrorLine")
    private Integer errorLine;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "ErrorMessage")
    private String errorMessage;

    public Errorlog() {
    }

    public Errorlog(Integer errorLogID) {
        this.errorLogID = errorLogID;
    }

    public Errorlog(Integer errorLogID, Date errorTime, String userName, int errorNumber, String errorMessage) {
        this.errorLogID = errorLogID;
        this.errorTime = errorTime;
        this.userName = userName;
        this.errorNumber = errorNumber;
        this.errorMessage = errorMessage;
    }

    public Integer getErrorLogID() {
        return errorLogID;
    }

    public void setErrorLogID(Integer errorLogID) {
        this.errorLogID = errorLogID;
    }

    public Date getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(Date errorTime) {
        this.errorTime = errorTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getErrorNumber() {
        return errorNumber;
    }

    public void setErrorNumber(int errorNumber) {
        this.errorNumber = errorNumber;
    }

    public Integer getErrorSeverity() {
        return errorSeverity;
    }

    public void setErrorSeverity(Integer errorSeverity) {
        this.errorSeverity = errorSeverity;
    }

    public Integer getErrorState() {
        return errorState;
    }

    public void setErrorState(Integer errorState) {
        this.errorState = errorState;
    }

    public String getErrorProcedure() {
        return errorProcedure;
    }

    public void setErrorProcedure(String errorProcedure) {
        this.errorProcedure = errorProcedure;
    }

    public Integer getErrorLine() {
        return errorLine;
    }

    public void setErrorLine(Integer errorLine) {
        this.errorLine = errorLine;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (errorLogID != null ? errorLogID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Errorlog)) {
            return false;
        }
        Errorlog other = (Errorlog) object;
        if ((this.errorLogID == null && other.errorLogID != null) || (this.errorLogID != null && !this.errorLogID.equals(other.errorLogID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.materialadmin.models.Errorlog[ errorLogID=" + errorLogID + " ]";
    }

}
