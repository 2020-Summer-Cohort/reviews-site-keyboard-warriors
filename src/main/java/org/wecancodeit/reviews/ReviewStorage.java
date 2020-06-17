package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

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
}
