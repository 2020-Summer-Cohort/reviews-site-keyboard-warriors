package org.wecancodeit.reviews.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.entities.Category;

public interface CategoryRepository extends CrudRepository <Category, Long> {
    Category findByName(String categoryName);
}
