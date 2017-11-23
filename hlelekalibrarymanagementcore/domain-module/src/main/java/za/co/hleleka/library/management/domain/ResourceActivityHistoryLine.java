package za.co.hleleka.library.management.domain;

import javax.persistence.*;

@Entity
@Table(name = "resource_activity_history_line")
public class ResourceActivityHistoryLine {

    @Id
    @Column(name = "resource_activity_history_line_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resourceActivityHistoryLineId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserTable userTable;

    @ManyToOne
    @JoinColumn(name = "resource_activity_history_id")
    private ResourceActivityHistory resourceActivityHistory;

    @ManyToOne
    @JoinColumn(name = "activity_type_id")
    private ActivityType activityType;

    public Integer getResourceActivityHistoryLineId() {
        return resourceActivityHistoryLineId;
    }

    public void setResourceActivityHistoryLineId(Integer resourceActivityHistoryLineId) {
        this.resourceActivityHistoryLineId = resourceActivityHistoryLineId;
    }

    public UserTable getUserTable() {
        return userTable;
    }

    public void setUserTable(UserTable userTable) {
        this.userTable = userTable;
    }

    public ResourceActivityHistory getResourceActivityHistory() {
        return resourceActivityHistory;
    }

    public void setResourceActivityHistory(ResourceActivityHistory resourceActivityHistory) {
        this.resourceActivityHistory = resourceActivityHistory;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }
}
