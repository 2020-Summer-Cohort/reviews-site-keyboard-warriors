package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class CategoryStorage {
    Map<String, Category> categories = new HashMap<>();

    public CategoryStorage(){
        categories.put("SUV", new Category("SUV", null));
    }
    public Category findCategoryByName(String categoryName){
        return categories.get(categoryName);
    }
}
