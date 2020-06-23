package org.wecancodeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
@Entity
public class Category {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(mappedBy = "category")
    private Collection<Review> reviews;

    protected Category(){}
    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
        public Collection<Review> getReviews() {
        return reviews;
    }
}
