package com.shop.ecommercesuperpoderoso.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "user_payment", schema = "public", catalog = "e-commerce-superpoderoso")
public class UserPaymentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "user_id", nullable = true)
    private Integer userId;
    @Basic
    @Column(name = "payment_type", nullable = true, length = -1)
    private String paymentType;
    @Basic
    @Column(name = "provider", nullable = true, length = -1)
    private String provider;
    @Basic
    @Column(name = "account_no", nullable = true)
    private Integer accountNo;
    @Basic
    @Column(name = "expiry", nullable = true)
    private Date expiry;

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

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPaymentEntity that = (UserPaymentEntity) o;
        return id == that.id && Objects.equals(userId, that.userId) && Objects.equals(paymentType, that.paymentType) && Objects.equals(provider, that.provider) && Objects.equals(accountNo, that.accountNo) && Objects.equals(expiry, that.expiry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, paymentType, provider, accountNo, expiry);
    }
}
