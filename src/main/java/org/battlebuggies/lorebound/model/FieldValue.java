package org.battlebuggies.lorebound.model;

import jakarta.persistence.*;
/**
Keeps all the values for the template attributes
 */
@Entity
public class FieldValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String value;

    @ManyToOne
    @JoinColumn(name = "template_field_id")
    private TemplateField templateField;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
}
