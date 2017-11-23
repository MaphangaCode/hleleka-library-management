package za.co.hleleka.library.management.domain;

import javax.persistence.*;

@Entity
@Table(name = "review_line")
public class ReviewLine {

    @Id
    @Column(name = "review_line_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewLineId;

    @ManyToOne
    @JoinColumn(name = "review_id", nullable = false)
    private Review review;

    @ManyToOne
    @JoinColumn(name = "resource_id", nullable = false)
    private Resource resource;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserTable userTable;

    public Integer getReviewLineId() {
        return reviewLineId;
    }

    public void setReviewLineId(Integer reviewLineId) {
        this.reviewLineId = reviewLineId;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
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
