package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code", length = 2)
    private String code;

    @Column(name = "co_name", nullable = false)
    private String name;

    // Constructors
    public Country() {}
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getters & Setters
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
