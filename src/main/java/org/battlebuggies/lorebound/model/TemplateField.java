package org.battlebuggies.lorebound.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class TemplateField {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @OneToMany(mappedBy = "templateField")
    private Set<FieldValue> fieldValue;

    public TemplateField() {}
    public TemplateField(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<FieldValue> getAttributeInfo() {
        return fieldValue;
    }

    public void setAttributeInfo(Set<FieldValue> fieldValue) {
        this.fieldValue = fieldValue;
    }
}
