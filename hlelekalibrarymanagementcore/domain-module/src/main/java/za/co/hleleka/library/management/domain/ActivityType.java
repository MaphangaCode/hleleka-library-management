package za.co.hleleka.library.management.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "activity_type")
public class ActivityType {

    @Id
    @Column(name = "activity_type_id", nullable =  false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer activityTypeId;

    @Basic
    @Column(name = "value", nullable = false, unique = true)
    private String value;

    @Basic
    @Column(name = "description", nullable = false, unique = true)
    private String description;

    @OneToMany(mappedBy = "activityType")
    private List<ResourceActivityHistoryLine> resourceActivityHistoryLineList;

    public Integer getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(Integer activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ResourceActivityHistoryLine> getResourceActivityHistoryLineList() {
        return resourceActivityHistoryLineList;
    }

    public void setResourceActivityHistoryLineList(List<ResourceActivityHistoryLine> resourceActivityHistoryLineList) {
        this.resourceActivityHistoryLineList = resourceActivityHistoryLineList;
    }
}
