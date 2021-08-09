package com.tm.manager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Brand {
    @Id
    @GeneratedValue
    private Long id;
    private String owner;
    private String name;
    @OneToMany(mappedBy = "brand")
    private List<Product> productList;
}