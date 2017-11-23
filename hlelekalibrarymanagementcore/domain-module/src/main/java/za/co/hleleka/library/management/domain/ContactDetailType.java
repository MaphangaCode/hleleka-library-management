package za.co.hleleka.library.management.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contact_detail_type")
public class ContactDetailType {

    @Id
    @Column(name = "contact_detail_type_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contactDetailTypeId;

    @Basic
    @Column(name = "value", nullable = false, unique = true)
    private String value;

    @Basic
    @Column(name = "description", nullable = false, unique = true)
    private String description;

    @OneToMany(mappedBy = "contactDetailType")
    private List<ContactDetail> contactDetailList;

    public Integer getContactDetailTypeId() {
        return contactDetailTypeId;
    }

    public void setContactDetailTypeId(Integer contactDetailTypeId) {
        this.contactDetailTypeId = contactDetailTypeId;
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

    public List<ContactDetail> getContactDetailList() {
        return contactDetailList;
    }

    public void setContactDetailList(List<ContactDetail> contactDetailList) {
        this.contactDetailList = contactDetailList;
    }
}
