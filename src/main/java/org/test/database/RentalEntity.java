package org.test.database;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rental", schema = "public", catalog = "pagila")
public class RentalEntity {
    private int rentalId;
    private Object rentalDate;
    private int inventoryId;
    private int customerId;
    private Object returnDate;
    private int staffId;
    private java.time.Instant lastUpdate;

    @Id
    @Column(name = "rental_id")
    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    @Basic
    @Column(name = "rental_date")
    public Object getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Object rentalDate) {
        this.rentalDate = rentalDate;
    }

    @Basic
    @Column(name = "inventory_id")
    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Basic
    @Column(name = "customer_id")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "return_date")
    public Object getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Object returnDate) {
        this.returnDate = returnDate;
    }

    @Basic
    @Column(name = "staff_id")
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
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
        RentalEntity that = (RentalEntity) o;
        return rentalId == that.rentalId && inventoryId == that.inventoryId && customerId == that.customerId && staffId == that.staffId && Objects.equals(rentalDate, that.rentalDate) && Objects.equals(returnDate, that.returnDate) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentalId, rentalDate, inventoryId, customerId, returnDate, staffId, lastUpdate);
    }
}
