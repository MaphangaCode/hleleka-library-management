package za.co.hleleka.library.management.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "resource_table")
public class Resource {

    @Id
    @Column(name = "resource_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resourceId;

    @Basic
    @Column(name = "title", nullable = false, unique = true)
    private String title;

    @Basic
    @Column(name = "description", nullable = false, unique = true)
    private String description;

    @Basic
    @Column(name = "publication_date")
    private Date publicationDate;

    @Basic
    @Column(name = "edition", nullable = false)
    private Short edition;

    @ManyToOne
    @JoinColumn(name = "resource_type_id")
    private ResourceType resourceType;

    @OneToMany(mappedBy = "resource")
    private List<ResourceLine> resourceLineList;

    @OneToMany(mappedBy = "resource")
    private List<ResourceActivityHistory> resourceActivityHistoryList;

    @OneToMany(mappedBy = "resource")
    private List<ReviewLine> reviewLineList;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
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

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public Short getEdition() {
        return edition;
    }

    public void setEdition(Short edition) {
        this.edition = edition;
    }

    public List<ResourceLine> getResourceLineList() {
        return resourceLineList;
    }

    public void setResourceLineList(List<ResourceLine> resourceLineList) {
        this.resourceLineList = resourceLineList;
    }

    public List<ResourceActivityHistory> getResourceActivityHistoryList() {
        return resourceActivityHistoryList;
    }

    public void setResourceActivityHistory(List<ResourceActivityHistory> resourceActivityHistoryList) {
        this.resourceActivityHistoryList = resourceActivityHistoryList;
    }

    public List<ReviewLine> getReviewLineList() {
        return reviewLineList;
    }

    public void setReviewLineList(List<ReviewLine> reviewLineList) {
        this.reviewLineList = reviewLineList;
    }
}
