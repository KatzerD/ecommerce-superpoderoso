package com.shop.ecommercesuperpoderoso.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "address", schema = "public", catalog = "e-commerce-superpoderoso")
public class AddressEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "user_id", nullable = true)
    private Integer userId;
    @Basic
    @Column(name = "postal_code", nullable = true, length = -1)
    private String postalCode;
    @Basic
    @Column(name = "city", nullable = true, length = -1)
    private String city;
    @Basic
    @Column(name = "country", nullable = true, length = -1)
    private String country;
    @Basic
    @Column(name = "address_line", nullable = true, length = -1)
    private String addressLine;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return id == that.id && Objects.equals(userId, that.userId) && Objects.equals(postalCode, that.postalCode) && Objects.equals(city, that.city) && Objects.equals(country, that.country) && Objects.equals(addressLine, that.addressLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, postalCode, city, country, addressLine);
    }
}
