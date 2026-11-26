package org.battlebuggies.lorebound.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;
    private String bannerPath;

    @OneToMany(mappedBy = "campaign")
    private Set<Article> articles;

    public Campaign(int id, String title, String description, String bannerPath) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.bannerPath = bannerPath;
    }

    public Campaign(){

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBannerPath() {
        return bannerPath;
    }

    public void setBannerPath(String bannerPath) {
        this.bannerPath = bannerPath;
    }
}
