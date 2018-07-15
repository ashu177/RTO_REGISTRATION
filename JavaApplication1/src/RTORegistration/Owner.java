/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTORegistration;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author utkar
 */
@Entity
@Table(name = "owner", catalog = "mydatabase", schema = "")
@NamedQueries({
    @NamedQuery(name = "Owner.findAll", query = "SELECT o FROM Owner o")
    , @NamedQuery(name = "Owner.findByCardNo", query = "SELECT o FROM Owner o WHERE o.cardNo = :cardNo")
    , @NamedQuery(name = "Owner.findByName", query = "SELECT o FROM Owner o WHERE o.name = :name")
    , @NamedQuery(name = "Owner.findByDob", query = "SELECT o FROM Owner o WHERE o.dob = :dob")
    , @NamedQuery(name = "Owner.findByGender", query = "SELECT o FROM Owner o WHERE o.gender = :gender")
    , @NamedQuery(name = "Owner.findBySwd", query = "SELECT o FROM Owner o WHERE o.swd = :swd")
    , @NamedQuery(name = "Owner.findByStreet", query = "SELECT o FROM Owner o WHERE o.street = :street")
    , @NamedQuery(name = "Owner.findByCity", query = "SELECT o FROM Owner o WHERE o.city = :city")
    , @NamedQuery(name = "Owner.findByPin", query = "SELECT o FROM Owner o WHERE o.pin = :pin")})
public class Owner implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Card_No")
    private String cardNo;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Column(name = "DOB")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "SWD")
    private String swd;
    @Column(name = "Street")
    private String street;
    @Column(name = "City")
    private String city;
    @Column(name = "PIN")
    private String pin;

    public Owner() {
    }

    public Owner(String cardNo) {
        this.cardNo = cardNo;
    }

    public Owner(String cardNo, String name) {
        this.cardNo = cardNo;
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        String oldCardNo = this.cardNo;
        this.cardNo = cardNo;
        changeSupport.firePropertyChange("cardNo", oldCardNo, cardNo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        Date oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getSwd() {
        return swd;
    }

    public void setSwd(String swd) {
        String oldSwd = this.swd;
        this.swd = swd;
        changeSupport.firePropertyChange("swd", oldSwd, swd);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        String oldStreet = this.street;
        this.street = street;
        changeSupport.firePropertyChange("street", oldStreet, street);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        String oldPin = this.pin;
        this.pin = pin;
        changeSupport.firePropertyChange("pin", oldPin, pin);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cardNo != null ? cardNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Owner)) {
            return false;
        }
        Owner other = (Owner) object;
        if ((this.cardNo == null && other.cardNo != null) || (this.cardNo != null && !this.cardNo.equals(other.cardNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Owner[ cardNo=" + cardNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
