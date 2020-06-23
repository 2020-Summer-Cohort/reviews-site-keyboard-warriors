package org.wecancodeit.reviews.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

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
    @ManyToMany
    private Collection<Hashtag> hashtags;
    @OneToMany(mappedBy = "review")
    private Collection<UserComment> userComments;

    protected Review(){}

    public Review(String make, String model, int year, String review, String backGroundPic, Category category, Hashtag... hashtags) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.review = review;
        this.category = category;
        this.backGroundPic = backGroundPic;
        this.hashtags = new ArrayList<>(Arrays.asList(hashtags));
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review1 = (Review) o;
        return id == review1.id &&
                year == review1.year &&
                Objects.equals(make, review1.make) &&
                Objects.equals(model, review1.model) &&
                Objects.equals(review, review1.review) &&
                Objects.equals(backGroundPic, review1.backGroundPic) &&
                Objects.equals(category, review1.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make, model, year, review, backGroundPic, category, userComments);
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", review='" + review + '\'' +
                ", backGroundPic='" + backGroundPic + '\'' +
                ", category=" + category +
                ", userComments=" + userComments +
                '}';
    }

    public Collection<UserComment> getUserComments() {
        return userComments;
    }

    public void addHashtag(Hashtag hashtagToAdd) {
        hashtags.add(hashtagToAdd);
    }
}
