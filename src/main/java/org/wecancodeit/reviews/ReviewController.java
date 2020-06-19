package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

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
    public String addReview(String make, String model, int year,  String review, String backGroundPic, Category category, String hashtagName){
        Hashtag hashtagToAdd = new Hashtag(hashtagName);
        hashtagStorage.addHashtag(hashtagToAdd);
        Review reviewToAdd = new Review(make, model, year, review, backGroundPic, category, hashtagToAdd);
        reviewStorage.addReview(reviewToAdd);
        return "redirect:/categories/" + category.getName();
    }
    @PostMapping("/review/addComment")
    public String addComment(String userComment, Review review){
        UserComment commentToAdd = new UserComment(userComment, review);
        userCommentStorage.addComment(commentToAdd);
        return "redirect:/reviews/"+review.getMake();
    }
}

