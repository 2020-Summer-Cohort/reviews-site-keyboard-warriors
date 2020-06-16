package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private long id;
    private String make;
    private String model;
    private int year;
    private String review;
    private String backGroundPic;
    @ManyToOne
    private Category category;

    protected Review(){}

    public Review(String make, String model, int year, String review, String backGroundPic, Category category) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.review = review;
        this.category = category;
        this.backGroundPic = backGroundPic;
    }

    public Category getCategory() {
        return category;
    }

    public long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {

        return model;
    }

    public int getYear() {

        return year;
    }

    public String getReview() {

        return review;
    }

    public String getBackGroundPic() {

        return backGroundPic;
    }
}
