package com.tm.manager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Size {
    @Id
    @GeneratedValue
    private Long id;
    private String unit;
    private int size;
    private String country;

}
