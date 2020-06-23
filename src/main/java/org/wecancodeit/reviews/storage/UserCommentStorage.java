package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.storage.repositories.UserCommentRepository;
import org.wecancodeit.reviews.entities.UserComment;

@Service
public class UserCommentStorage {
    UserCommentRepository userCommentRepo;

    public UserCommentStorage(UserCommentRepository userCommentRepo) {
        this.userCommentRepo = userCommentRepo;
    }

    public Iterable<UserComment> findAllUserComments(){
        return userCommentRepo.findAll();
    }

    public void addComment(UserComment userComment){
        userCommentRepo.save(userComment);
    }

}
