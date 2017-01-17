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
@Table(name = "databaselog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Databaselog.findAll", query = "SELECT d FROM Databaselog d"),
    @NamedQuery(name = "Databaselog.findByDatabaseLogID", query = "SELECT d FROM Databaselog d WHERE d.databaseLogID = :databaseLogID"),
    @NamedQuery(name = "Databaselog.findByPostTime", query = "SELECT d FROM Databaselog d WHERE d.postTime = :postTime"),
    @NamedQuery(name = "Databaselog.findByDatabaseUser", query = "SELECT d FROM Databaselog d WHERE d.databaseUser = :databaseUser"),
    @NamedQuery(name = "Databaselog.findByEvent", query = "SELECT d FROM Databaselog d WHERE d.event = :event"),
    @NamedQuery(name = "Databaselog.findBySchema", query = "SELECT d FROM Databaselog d WHERE d.schema = :schema"),
    @NamedQuery(name = "Databaselog.findByObject", query = "SELECT d FROM Databaselog d WHERE d.object = :object")})
public class Databaselog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DatabaseLogID")
    private Integer databaseLogID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PostTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "DatabaseUser")
    private String databaseUser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "Event")
    private String event;
    @Size(max = 128)
    @Column(name = "Schema")
    private String schema;
    @Size(max = 128)
    @Column(name = "Object")
    private String object;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "TSQL")
    private String tsql;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "XmlEvent")
    private String xmlEvent;

    public Databaselog() {
    }

    public Databaselog(Integer databaseLogID) {
        this.databaseLogID = databaseLogID;
    }

    public Databaselog(Integer databaseLogID, Date postTime, String databaseUser, String event, String tsql, String xmlEvent) {
        this.databaseLogID = databaseLogID;
        this.postTime = postTime;
        this.databaseUser = databaseUser;
        this.event = event;
        this.tsql = tsql;
        this.xmlEvent = xmlEvent;
    }

    public Integer getDatabaseLogID() {
        return databaseLogID;
    }

    public void setDatabaseLogID(Integer databaseLogID) {
        this.databaseLogID = databaseLogID;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getDatabaseUser() {
        return databaseUser;
    }

    public void setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getTsql() {
        return tsql;
    }

    public void setTsql(String tsql) {
        this.tsql = tsql;
    }

    public String getXmlEvent() {
        return xmlEvent;
    }

    public void setXmlEvent(String xmlEvent) {
        this.xmlEvent = xmlEvent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (databaseLogID != null ? databaseLogID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Databaselog)) {
            return false;
        }
        Databaselog other = (Databaselog) object;
        if ((this.databaseLogID == null && other.databaseLogID != null) || (this.databaseLogID != null && !this.databaseLogID.equals(other.databaseLogID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kurtomerfaruk.materialadmin.models.Databaselog[ databaseLogID=" + databaseLogID + " ]";
    }

}
