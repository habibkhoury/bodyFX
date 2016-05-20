/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfx;

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
 * @author DANNY
 */
@Entity
@Table(name = "members", catalog = "bodyfx", schema = "")
@NamedQueries({
    @NamedQuery(name = "Members.findAll", query = "SELECT m FROM Members m"),
    @NamedQuery(name = "Members.findByMemberId", query = "SELECT m FROM Members m WHERE m.memberId = :memberId"),
    @NamedQuery(name = "Members.findByMemberName", query = "SELECT m FROM Members m WHERE m.memberName = :memberName"),
    @NamedQuery(name = "Members.findByMemberLastname", query = "SELECT m FROM Members m WHERE m.memberLastname = :memberLastname"),
    @NamedQuery(name = "Members.findByMemberPhone", query = "SELECT m FROM Members m WHERE m.memberPhone = :memberPhone"),
    @NamedQuery(name = "Members.findByMemberAddress", query = "SELECT m FROM Members m WHERE m.memberAddress = :memberAddress"),
    @NamedQuery(name = "Members.findByMemberDob", query = "SELECT m FROM Members m WHERE m.memberDob = :memberDob"),
    @NamedQuery(name = "Members.findByMemberRegistration", query = "SELECT m FROM Members m WHERE m.memberRegistration = :memberRegistration")})
public class Members implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "member_id")
    private Integer memberId;
    @Column(name = "member_name")
    private String memberName;
    @Column(name = "member_lastname")
    private String memberLastname;
    @Column(name = "member_phone")
    private Integer memberPhone;
    @Column(name = "member_address")
    private String memberAddress;
    @Column(name = "member_dob")
    @Temporal(TemporalType.DATE)
    private Date memberDob;
    @Column(name = "member_registration")
    private String memberRegistration;

    public Members() {
    }

    public Members(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        Integer oldMemberId = this.memberId;
        this.memberId = memberId;
        changeSupport.firePropertyChange("memberId", oldMemberId, memberId);
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        String oldMemberName = this.memberName;
        this.memberName = memberName;
        changeSupport.firePropertyChange("memberName", oldMemberName, memberName);
    }

    public String getMemberLastname() {
        return memberLastname;
    }

    public void setMemberLastname(String memberLastname) {
        String oldMemberLastname = this.memberLastname;
        this.memberLastname = memberLastname;
        changeSupport.firePropertyChange("memberLastname", oldMemberLastname, memberLastname);
    }

    public Integer getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(Integer memberPhone) {
        Integer oldMemberPhone = this.memberPhone;
        this.memberPhone = memberPhone;
        changeSupport.firePropertyChange("memberPhone", oldMemberPhone, memberPhone);
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        String oldMemberAddress = this.memberAddress;
        this.memberAddress = memberAddress;
        changeSupport.firePropertyChange("memberAddress", oldMemberAddress, memberAddress);
    }

    public Date getMemberDob() {
        return memberDob;
    }

    public void setMemberDob(Date memberDob) {
        Date oldMemberDob = this.memberDob;
        this.memberDob = memberDob;
        changeSupport.firePropertyChange("memberDob", oldMemberDob, memberDob);
    }

    public String getMemberRegistration() {
        return memberRegistration;
    }

    public void setMemberRegistration(String memberRegistration) {
        String oldMemberRegistration = this.memberRegistration;
        this.memberRegistration = memberRegistration;
        changeSupport.firePropertyChange("memberRegistration", oldMemberRegistration, memberRegistration);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memberId != null ? memberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Members)) {
            return false;
        }
        Members other = (Members) object;
        if ((this.memberId == null && other.memberId != null) || (this.memberId != null && !this.memberId.equals(other.memberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bodyfx.Members[ memberId=" + memberId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
