/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTORegistration;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author utkar
 */
@Entity
@Table(name = "manufacturer", catalog = "mydatabase", schema = "")
@NamedQueries({
    @NamedQuery(name = "Manufacturer.findAll", query = "SELECT m FROM Manufacturer m")
    , @NamedQuery(name = "Manufacturer.findByMfrId", query = "SELECT m FROM Manufacturer m WHERE m.mfrId = :mfrId")
    , @NamedQuery(name = "Manufacturer.findByMFRName", query = "SELECT m FROM Manufacturer m WHERE m.mFRName = :mFRName")
    , @NamedQuery(name = "Manufacturer.findByWebsite", query = "SELECT m FROM Manufacturer m WHERE m.website = :website")
    , @NamedQuery(name = "Manufacturer.findByHeadquarters", query = "SELECT m FROM Manufacturer m WHERE m.headquarters = :headquarters")
    , @NamedQuery(name = "Manufacturer.findByContactNo", query = "SELECT m FROM Manufacturer m WHERE m.contactNo = :contactNo")})
public class Manufacturer implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MFR_ID")
    private String mfrId;
    @Basic(optional = false)
    @Column(name = "MFR_Name")
    private String mFRName;
    @Column(name = "Website")
    private String website;
    @Column(name = "Headquarters")
    private String headquarters;
    @Column(name = "Contact_No")
    private String contactNo;

    public Manufacturer() {
    }

    public Manufacturer(String mfrId) {
        this.mfrId = mfrId;
    }

    public Manufacturer(String mfrId, String mFRName) {
        this.mfrId = mfrId;
        this.mFRName = mFRName;
    }

    public String getMfrId() {
        return mfrId;
    }

    public void setMfrId(String mfrId) {
        String oldMfrId = this.mfrId;
        this.mfrId = mfrId;
        changeSupport.firePropertyChange("mfrId", oldMfrId, mfrId);
    }

    public String getMFRName() {
        return mFRName;
    }

    public void setMFRName(String mFRName) {
        String oldMFRName = this.mFRName;
        this.mFRName = mFRName;
        changeSupport.firePropertyChange("MFRName", oldMFRName, mFRName);
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        String oldWebsite = this.website;
        this.website = website;
        changeSupport.firePropertyChange("website", oldWebsite, website);
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        String oldHeadquarters = this.headquarters;
        this.headquarters = headquarters;
        changeSupport.firePropertyChange("headquarters", oldHeadquarters, headquarters);
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        String oldContactNo = this.contactNo;
        this.contactNo = contactNo;
        changeSupport.firePropertyChange("contactNo", oldContactNo, contactNo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mfrId != null ? mfrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manufacturer)) {
            return false;
        }
        Manufacturer other = (Manufacturer) object;
        if ((this.mfrId == null && other.mfrId != null) || (this.mfrId != null && !this.mfrId.equals(other.mfrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Manufacturer[ mfrId=" + mfrId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
