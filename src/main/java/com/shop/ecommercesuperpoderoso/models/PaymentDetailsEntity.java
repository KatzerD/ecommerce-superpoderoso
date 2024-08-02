package com.shop.ecommercesuperpoderoso.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "payment_details", schema = "public", catalog = "e-commerce-superpoderoso")
public class PaymentDetailsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "order_id", nullable = true)
    private Integer orderId;
    @Basic
    @Column(name = "amount", nullable = true, precision = 0)
    private Double amount;
    @Basic
    @Column(name = "provider", nullable = true, length = -1)
    private String provider;
    @Basic
    @Column(name = "status", nullable = true, length = -1)
    private String status;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderDetailsEntity orderDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentDetailsEntity that = (PaymentDetailsEntity) o;
        return id == that.id && Objects.equals(orderId, that.orderId) && Objects.equals(amount, that.amount) && Objects.equals(provider, that.provider) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, amount, provider, status);
    }
}
