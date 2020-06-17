package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String hashtagName;
    @ManyToMany(mappedBy = "hashtags")
    private Collection<Review> reviews;

    protected Hashtag (){}

    public Hashtag(String hashtagName) {
        this.hashtagName = hashtagName;
    }

    public long getId() {
        return id;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public String getHashtagName() {
        return hashtagName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hashtag hashtag = (Hashtag) o;
        return id == hashtag.id &&
                Objects.equals(hashtagName, hashtag.hashtagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hashtagName);
    }

    @Override
    public String toString() {
        return "Hashtag{" +
                "id=" + id +
                ", hashtagName='" + hashtagName + '\'' +
                '}';
    }
}
