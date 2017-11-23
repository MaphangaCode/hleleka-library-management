package za.co.hleleka.library.management.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "resource_activity_history")
public class ResourceActivityHistory {

    @Id
    @Column(name = "resource_activity_history_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resourceActivityHistoryId;

    @Basic
    @Column(name = "quantity_before_activity", nullable = false)
    private Integer quantityBeforeActivity;

    @Basic
    @Column(name = "activity_date", nullable = false)
    private Date activityDate;

    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;

    @OneToMany(mappedBy = "resourceActivityHistory")
    private List<ResourceActivityHistoryLine> resourceActivityHistoryLineList;

    public Integer getResourceActivityHistoryId() {
        return resourceActivityHistoryId;
    }

    public void setResourceActivityHistoryId(Integer resourceActivityHistoryId) {
        this.resourceActivityHistoryId = resourceActivityHistoryId;
    }

    public Integer getQuantityBeforeActivity() {
        return quantityBeforeActivity;
    }

    public void setQuantityBeforeActivity(Integer quantityBeforeActivity) {
        this.quantityBeforeActivity = quantityBeforeActivity;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public List<ResourceActivityHistoryLine> getResourceActivityHistoryLineList() {
        return resourceActivityHistoryLineList;
    }

    public void setResourceActivityHistoryLineList(List<ResourceActivityHistoryLine> resourceActivityHistoryLineList) {
        this.resourceActivityHistoryLineList = resourceActivityHistoryLineList;
    }
}
