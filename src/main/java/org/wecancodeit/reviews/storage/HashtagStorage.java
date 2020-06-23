package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.storage.repositories.HashtagRepository;
import org.wecancodeit.reviews.entities.Hashtag;

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

    public void addHashtag(Hashtag hashtagToAdd) {
        hashtagRepo.save(hashtagToAdd);
    }
}
