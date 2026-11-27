package org.battlebuggies.lorebound.model;

import jakarta.persistence.*;
/**
Keeps all the values for the template attributes
 */
@Entity
public class AttributeInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String value;

    @ManyToOne
    private Attribute attribute;

    @ManyToOne
    private Article article;
}
