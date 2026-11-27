package org.battlebuggies.lorebound.model;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "campaign")
    private Campaign campaign;

    private String title;

    @ManyToMany
    @JoinTable(
            name = "tag"
    )
    private Set<Tag> tags;

    private String body;
    private String imgPath;
    private boolean status;
    private String type;


    @OneToMany
    private List<AttributeInfo> attribute;


    public Article(int id, Campaign campaign,
                   String title, Set<Tag> tags,
                   String body, String imgPath,
                   boolean status, String type, List<AttributeInfo> attribute) {
        this.id = id;
        this.campaign = campaign;
        this.title = title;
        this.tags = tags;
        this.body = body;
        this.imgPath = imgPath;
        this.status = status;
        this.type = type;
        this.attribute = attribute;
    }

    public Article(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

       public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public List<AttributeInfo> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<AttributeInfo> attribute) {
        this.attribute = attribute;
    }
}
