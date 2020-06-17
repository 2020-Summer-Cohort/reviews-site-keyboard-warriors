package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

@Service
public class HashtagStorage {
private HashtagRepository hashtagRepo;

    public HashtagStorage(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }

    public Iterable<Hashtag> findAllHashtags(){
        return hashtagRepo.findAll();
    }

    public Hashtag findHashtagByHashtagName(String hashtagName) {
        return hashtagRepo.findByHashtagName(hashtagName);
    }
}
