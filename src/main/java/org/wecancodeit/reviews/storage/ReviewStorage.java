package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.storage.repositories.ReviewRepository;
import org.wecancodeit.reviews.entities.Review;

@Service
public class ReviewStorage {
    ReviewRepository reviewRepo;

    public ReviewStorage(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;


    }

    public Review findReviewByMake(String reviewTitle) {
        return reviewRepo.findByMake(reviewTitle);
    }
    public Iterable <Review> findAllReviews(){
        return reviewRepo.findAll();
    }

    public void addReview(Review review){
        reviewRepo.save(review);
    }

    public void deleteAReview(Review review) {
        reviewRepo.delete(review);
    }
}
