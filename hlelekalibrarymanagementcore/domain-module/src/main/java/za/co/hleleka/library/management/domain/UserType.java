package za.co.hleleka.library.management.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_type")
public class UserType {

    @Id
    @Column(name = "user_type_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userTypeId;

    @Basic
    @Column(name = "value")
    private String value;

    @Basic
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "userType")
    private List<UserTable> userTableList;


    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
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

    public List<UserTable> getUserTableList() {
        return userTableList;
    }

    public void setUserTableList(List<UserTable> userTableList) {
        this.userTableList = userTableList;
    }
}
