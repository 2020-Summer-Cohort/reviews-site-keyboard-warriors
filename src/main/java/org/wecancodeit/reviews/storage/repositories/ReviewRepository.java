package org.wecancodeit.reviews.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.entities.Review;

public interface ReviewRepository extends CrudRepository <Review, Long> {


    Review findByMake(String reviewTitle);
}
