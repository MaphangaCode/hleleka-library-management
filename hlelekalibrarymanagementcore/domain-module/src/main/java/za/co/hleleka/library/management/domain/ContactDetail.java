package za.co.hleleka.library.management.domain;

import javax.persistence.*;

@Entity
@Table(name = "contact_detail")
public class ContactDetail {

    @Id
    @Column(name = "contact_detail_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contactDetailId;

    @Basic
    @Column(name = "value", nullable = false, unique = true)
    private String value;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserTable userTable;

    @ManyToOne
    @JoinColumn(name = "contact_detail_type_id")
    private ContactDetailType contactDetailType;



    public Integer getContactDetailId() {
        return contactDetailId;
    }

    public void setContactDetailId(Integer contactDetailId) {
        this.contactDetailId = contactDetailId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public UserTable getUserTable() {
        return userTable;
    }

    public void setUserTable(UserTable userTable) {
        this.userTable = userTable;
    }

    public ContactDetailType getContactDetailType() {
        return contactDetailType;
    }

    public void setContactDetailType(ContactDetailType contactDetailType) {
        this.contactDetailType = contactDetailType;
    }
}
