package org.battlebuggies.lorebound.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ArticleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @OneToMany
    private List<Article> article;




}
