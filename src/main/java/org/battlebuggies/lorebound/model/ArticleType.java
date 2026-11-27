package org.battlebuggies.lorebound.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class ArticleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;

    @OneToMany(mappedBy = "articleType")
    private List<Article> articles;

    @ManyToMany
    @JoinTable(
            name = "article_type_field",
            joinColumns = @JoinColumn(name = "article_type_id"),
            inverseJoinColumns = @JoinColumn(name = "field_id")
    )
    private Set<TemplateField> fields;
}
