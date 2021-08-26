package org.test.database;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "customer", schema = "public", catalog = "pagila")
public class CustomerEntity {
    private int customerId;
    private int storeId;
    private String firstName;
    private String lastName;
    private String email;
    private int addressId;
    private boolean activebool;
    private Date createDate;
    private java.time.Instant lastUpdate;
    private Integer active;

    @Id
    @Column(name = "customer_id")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "store_id")
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "address_id")
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "activebool")
    public boolean isActivebool() {
        return activebool;
    }

    public void setActivebool(boolean activebool) {
        this.activebool = activebool;
    }

    @Basic
    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "last_update")
    public java.time.Instant getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(java.time.Instant lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Basic
    @Column(name = "active")
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return customerId == that.customerId && storeId == that.storeId && addressId == that.addressId && activebool == that.activebool && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(createDate, that.createDate) && Objects.equals(lastUpdate, that.lastUpdate) && Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, storeId, firstName, lastName, email, addressId, activebool, createDate, lastUpdate, active);
    }
}
