package com.shop.ecommercesuperpoderoso.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "public", catalog = "e-commerce-superpoderoso")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "category_id", nullable = true)
    private Integer categoryId;
    @Basic
    @Column(name = "inventory_id", nullable = true)
    private Integer inventoryId;
    @Basic
    @Column(name = "name", nullable = true, length = -1)
    private String name;
    @Basic
    @Column(name = "available_qty", nullable = true)
    private Integer availableQty;
    @Basic
    @Column(name = "details", nullable = true, length = -1)
    private String details;
    @Basic
    @Column(name = "imageurl", nullable = true, length = -1)
    private Object imageurl;
    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    private Double price;
    @Basic
    @Column(name = "discount", nullable = true, precision = 0)
    private Double discount;
    @Basic
    @Column(name = "rating", nullable = true, precision = 0)
    private Double rating;
    @Basic
    @Column(name = "SKU", nullable = true, length = -1)
    private String sku;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<OrderItemsEntity> orderItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(Integer availableQty) {
        this.availableQty = availableQty;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Object getImageurl() {
        return imageurl;
    }

    public void setImageurl(Object imageurl) {
        this.imageurl = imageurl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return id == that.id && Objects.equals(categoryId, that.categoryId) && Objects.equals(inventoryId, that.inventoryId) && Objects.equals(name, that.name) && Objects.equals(availableQty, that.availableQty) && Objects.equals(details, that.details) && Objects.equals(imageurl, that.imageurl) && Objects.equals(price, that.price) && Objects.equals(discount, that.discount) && Objects.equals(rating, that.rating) && Objects.equals(sku, that.sku) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryId, inventoryId, name, availableQty, details, imageurl, price, discount, rating, sku, description);
    }
}
