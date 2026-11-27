package org.battlebuggies.lorebound.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @OneToMany
    private Set<AttributeInfo> attributeInfo;

    public Attribute() {}
    public Attribute(int id, String title) {
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

    public Set<AttributeInfo> getAttributeInfo() {
        return attributeInfo;
    }

    public void setAttributeInfo(Set<AttributeInfo> attributeInfo) {
        this.attributeInfo = attributeInfo;
    }
}
