package com.shop.ecommercesuperpoderoso.models;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "role", schema = "public", catalog = "e-commerce-superpoderoso")
public class RoleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "rol_name", nullable = true, length = -1)
    private String rolName;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<UserEntity> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEntity that = (RoleEntity) o;
        return id == that.id && Objects.equals(rolName, that.rolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rolName);
    }
}
