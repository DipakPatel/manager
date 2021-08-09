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
public class Type {
    @Id
    @GeneratedValue
    private Long id;
    private String type;
    @OneToMany(mappedBy = "type")
    private List<Product> productList;
}
