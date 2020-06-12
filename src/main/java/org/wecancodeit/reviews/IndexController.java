package org.wecancodeit.reviews;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {
    CategoryStorage categoryStorage;

    public IndexController(CategoryStorage categoryStorage) {
        this.categoryStorage = categoryStorage;
    }

    @RequestMapping("index")
    public String showAllCategories (Model model) {
        model.addAttribute("categories",categoryStorage.findAllCategories());
        return "index-template";
    }
}
