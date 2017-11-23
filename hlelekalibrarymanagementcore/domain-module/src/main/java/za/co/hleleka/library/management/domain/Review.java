package za.co.hleleka.library.management.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @Column(name = "review_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;

    @Basic
    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "review")
    private List<ReviewLine> reviewLineList;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ReviewLine> getReviewLineList() {
        return reviewLineList;
    }

    public void setReviewLineList(List<ReviewLine> reviewLineList) {
        this.reviewLineList = reviewLineList;
    }
}
