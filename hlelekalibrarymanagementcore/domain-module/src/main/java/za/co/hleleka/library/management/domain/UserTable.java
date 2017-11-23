package za.co.hleleka.library.management.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_table")
public class UserTable {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column
    private String surname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_type_id", nullable = false)
    private UserType userType;

    @OneToMany(mappedBy = "userTable")
    private List<ContactDetail> contactDetailList;

    @OneToOne(mappedBy = "userTable")
    private LoginDetails loginDetails;

    @OneToMany(mappedBy = "userTable")
    private List<ResourceLine> resourceLineList;

    @OneToMany(mappedBy = "userTable")
    private List<ResourceActivityHistoryLine> resourceActivityHistoryLineList;

    @OneToMany(mappedBy = "userTable")
    private List<ReviewLine> reviewLineList;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public List<ContactDetail> getContactDetailList() {
        return contactDetailList;
    }

    public void setContactDetailList(List<ContactDetail> contactDetailList) {
        this.contactDetailList = contactDetailList;
    }

    public LoginDetails getLoginDetails() {
        return loginDetails;
    }

    public void setLoginDetails(LoginDetails loginDetails) {
        this.loginDetails = loginDetails;
    }

    public List<ResourceLine> getResourceLineList() {
        return resourceLineList;
    }

    public void setResourceLineList(List<ResourceLine> resourceLineList) {
        this.resourceLineList = resourceLineList;
    }

    public List<ResourceActivityHistoryLine> getResourceActivityHistoryLineList() {
        return resourceActivityHistoryLineList;
    }

    public void setResourceActivityHistoryLineList(List<ResourceActivityHistoryLine> resourceActivityHistoryLineList) {
        this.resourceActivityHistoryLineList = resourceActivityHistoryLineList;
    }

    public List<ReviewLine> getReviewLineList() {
        return reviewLineList;
    }

    public void setReviewLineList(List<ReviewLine> reviewLineList) {
        this.reviewLineList = reviewLineList;
    }
}
