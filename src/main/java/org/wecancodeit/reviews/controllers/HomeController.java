package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.CategoryStorage;

@Controller
public class HomeController {
    CategoryStorage categoryStorage;

    public HomeController(CategoryStorage categoryStorage) {

        this.categoryStorage = categoryStorage;
    }

    @RequestMapping("")
    public String showAllCategories (Model model) {
        model.addAttribute("categories",categoryStorage.findAllCategories());
        return "home-template";
    }
}
