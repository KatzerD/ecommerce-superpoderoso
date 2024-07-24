package com.shop.ecommercesuperpoderoso.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "category_product", schema = "public", catalog = "e-commerce-superpoderoso")
@IdClass(CategoryProductEntityPK.class)
public class CategoryProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "category_id", nullable = false)
    private int categoryId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "product_category_id", nullable = false)
    private int productCategoryId;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryProductEntity that = (CategoryProductEntity) o;
        return categoryId == that.categoryId && productCategoryId == that.productCategoryId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, productCategoryId);
    }
}
