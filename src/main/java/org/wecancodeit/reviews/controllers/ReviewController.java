package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.reviews.storage.HashtagStorage;
import org.wecancodeit.reviews.storage.ReviewStorage;
import org.wecancodeit.reviews.storage.UserCommentStorage;
import org.wecancodeit.reviews.entities.Category;
import org.wecancodeit.reviews.entities.Hashtag;
import org.wecancodeit.reviews.entities.Review;
import org.wecancodeit.reviews.entities.UserComment;

@Controller
public class ReviewController {
    HashtagStorage hashtagStorage;
    ReviewStorage reviewStorage;
    UserCommentStorage userCommentStorage;

    public ReviewController(ReviewStorage reviewStorage, HashtagStorage hashtagStorage, UserCommentStorage userCommentStorage) {
        this.reviewStorage = reviewStorage;
        this.hashtagStorage = hashtagStorage;
        this.userCommentStorage = userCommentStorage;
    }

    @GetMapping("reviews/{reviewName}")
    public String showSingleReview(@PathVariable String reviewName, Model model) {
        model.addAttribute("review", reviewStorage.findReviewByMake(reviewName));
        return "review-template";
    }

    //now we need to add method to review storage class
    @PostMapping("/categories/review/add")
    public String addReview(String make, String model, int year, String review, String backGroundPic, Category category, String hashtagName) {
        Hashtag hashtagToAdd = new Hashtag(hashtagName);
        hashtagStorage.addHashtag(hashtagToAdd);
        Review reviewToAdd = new Review(make, model, year, review, backGroundPic, category, hashtagToAdd);
        reviewStorage.addReview(reviewToAdd);
        return "redirect:/categories/" + category.getName();
    }

    @PostMapping("/review/addComment")
    public String addComment(String userComment, Review review) {
        UserComment commentToAdd = new UserComment(userComment, review);
        userCommentStorage.addComment(commentToAdd);
        return "redirect:/reviews/" + review.getMake();
    }

    @PostMapping("/categories/review/delete")
    public String removeReview(Review review){
        reviewStorage.deleteAReview(review);
        return "redirect:/";
        }
    @PostMapping("/reviews/addHashtag")
    public String addHashTagToReview(String reviewMake, String hashtagName){
        if (hashtagStorage.findHashtagByHashtagName(hashtagName) != null) {
            Hashtag hashtagToAdd = hashtagStorage.findHashtagByHashtagName(hashtagName);
            Review review = reviewStorage.findReviewByMake(reviewMake);
            review.addHashtag(hashtagToAdd);
            reviewStorage.addReview(review);
            return "redirect:/reviews/" + reviewMake;
        }
    Hashtag hashtagToAdd = new Hashtag(hashtagName);
    hashtagStorage.addHashtag(hashtagToAdd);
    Review review = reviewStorage.findReviewByMake(reviewMake);
    review.addHashtag(hashtagToAdd);
    reviewStorage.addReview(review);
    return "redirect:/reviews/" + reviewMake;
    }

}