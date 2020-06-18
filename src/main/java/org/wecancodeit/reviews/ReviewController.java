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
    ReviewStorage reviewStorage;

    public ReviewController(ReviewStorage reviewStorage) {
        this.reviewStorage = reviewStorage;
    }

    @GetMapping("reviews/{reviewName}")
    public String showSingleReview(@PathVariable String reviewName, Model model) {
        model.addAttribute("review", reviewStorage.findReviewByMake(reviewName));
        return "review-template";
    }

    //now we need to add method to review storage class
    @PostMapping("reviews/add")
    public String addReview(String make, String model, int year,  String review, String backGroundPic, Category category, Hashtag... hashtags){
        Review reviewToAdd = new Review(make, model, year, review, "", category, hashtags);
        reviewStorage.addReview(reviewToAdd);
        return "redirect:/";
    }
}

