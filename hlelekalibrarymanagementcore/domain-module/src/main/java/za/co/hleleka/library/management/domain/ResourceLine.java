package za.co.hleleka.library.management.domain;

import javax.persistence.*;

@Entity
@Table(name = "resource_line")
public class ResourceLine {

    @Id
    @Column(name = "resource_line_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resourceLineId;

    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private UserTable userTable;

    public Integer getResourceLineId() {
        return resourceLineId;
    }

    public void setResourceLineId(Integer resourceLineId) {
        this.resourceLineId = resourceLineId;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public UserTable getUserTable() {
        return userTable;
    }

    public void setUserTable(UserTable userTable) {
        this.userTable = userTable;
    }
}
