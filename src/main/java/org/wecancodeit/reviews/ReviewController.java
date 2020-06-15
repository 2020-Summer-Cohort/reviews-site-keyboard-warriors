package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ReviewController {
    ReviewStorage reviewStorage;

    public ReviewController(ReviewStorage reviewStorage) {
        this.reviewStorage = reviewStorage;
    }

    @RequestMapping("reviews/{reviewName}")
    public String showSingleReview(@PathVariable String reviewName, Model model) {
        model.addAttribute("review", reviewStorage.findReviewByTitle(reviewName));
        return "review-template";
    }

}

