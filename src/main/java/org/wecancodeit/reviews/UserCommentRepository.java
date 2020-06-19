package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

public interface UserCommentRepository extends CrudRepository<UserComment, Long> {

}
