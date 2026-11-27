package org.battlebuggies.lorebound.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;

    private String title;

    @ManyToMany
    @JoinTable(
            name = "article_tag",
            joinColumns = @JoinColumn(name = "article_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags;

    private String body;
    private String imgPath;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "article_type_id")
    private ArticleType articleType;


    @OneToMany(mappedBy = "article")
    private List<FieldValue> fields;


    public Article(int id, Campaign campaign,
                   String title, Set<Tag> tags,
                   String body, String imgPath,
                   boolean status, ArticleType articleType, List<FieldValue> fields) {
        this.id = id;
        this.campaign = campaign;
        this.title = title;
        this.tags = tags;
        this.body = body;
        this.imgPath = imgPath;
        this.status = status;
        this.articleType = articleType;
        this.fields = fields;
    }

    public Article() {

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

    public ArticleType getType() {
        return articleType;
    }

    public void setType(ArticleType type) {
        this.articleType = type;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public List<FieldValue> getFields() {
        return fields;
    }

    public void setFields(List<FieldValue> fields) {
        this.fields = fields;
    }
}
