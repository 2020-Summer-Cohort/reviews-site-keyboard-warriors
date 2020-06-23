package org.wecancodeit.reviews.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.entities.UserComment;

public interface UserCommentRepository extends CrudRepository<UserComment, Long> {

}
