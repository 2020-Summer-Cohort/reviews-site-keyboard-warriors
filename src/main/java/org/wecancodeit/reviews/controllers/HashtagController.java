package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.HashtagStorage;

@Controller
public class HashtagController {
private HashtagStorage hashtagStorage;

    public HashtagController(HashtagStorage hashtagStorage) {
        this.hashtagStorage = hashtagStorage;
    }

    @RequestMapping("hashtags")
    public String showAllHashtags(Model model){
        model.addAttribute("hashtags", hashtagStorage.findAllHashtags());
        return "hashtags-template";
    }

    @RequestMapping ("hashtags/{hashtagName}")
    public String showSingleHashtag(@PathVariable String hashtagName, Model model){
        model.addAttribute("hashtag", hashtagStorage.findHashtagByHashtagName(hashtagName));
        return "hashtag-template";
    }

}
