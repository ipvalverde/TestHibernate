package org.test.database;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "public", catalog = "pagila")
public class AddressEntity {
    private int addressId;
    private String address;
    private String address2;
    private String district;
    private int cityId;
    private String postalCode;
    private String phone;
    private java.time.Instant lastUpdate;

    @Id
    @Column(name = "address_id")
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "address2")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "city_id")
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "last_update")
    public java.time.Instant getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(java.time.Instant lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return addressId == that.addressId && cityId == that.cityId && Objects.equals(address, that.address) && Objects.equals(address2, that.address2) && Objects.equals(district, that.district) && Objects.equals(postalCode, that.postalCode) && Objects.equals(phone, that.phone) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, address, address2, district, cityId, postalCode, phone, lastUpdate);
    }
}
