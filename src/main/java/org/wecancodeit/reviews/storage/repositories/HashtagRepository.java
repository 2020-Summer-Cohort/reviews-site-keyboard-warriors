package org.wecancodeit.reviews.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.entities.Hashtag;

public interface HashtagRepository extends CrudRepository<Hashtag, Long> {
    Hashtag findByHashtagName(String hashtagName);
}
