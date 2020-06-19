package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

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
