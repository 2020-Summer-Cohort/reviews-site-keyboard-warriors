package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserComment {
    @Id
    @GeneratedValue
    private long id;
    private String userComments;
    @ManyToOne
    private Review review;

    protected UserComment(){}

    public UserComment(String userComments, Review review) {
              this.userComments = userComments;
        this.review = review;
    }

    public String getUserComments() {
        return userComments;
    }

    public Review getReview() {
        return review;
    }
}
