package com.tm.manager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Size size;
    @ManyToOne
    private Color color;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Type type;
    private BigDecimal price;
}
