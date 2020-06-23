package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.entities.Category;
import org.wecancodeit.reviews.entities.Hashtag;
import org.wecancodeit.reviews.entities.Review;
import org.wecancodeit.reviews.storage.repositories.CategoryRepository;
import org.wecancodeit.reviews.storage.repositories.HashtagRepository;
import org.wecancodeit.reviews.storage.repositories.ReviewRepository;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    CategoryRepository categoryRepo;
    @Autowired
    ReviewRepository reviewRepo;
    @Autowired
    HashtagRepository hashtagRepo;

    @Override
    public void run(String... args) throws Exception {
        Category sportsCar = new Category("Sports Cars");
        Category suv = new Category("SUV");
        categoryRepo.save(sportsCar);
        categoryRepo.save(suv);
        Hashtag fast = new Hashtag("Fast");
        Hashtag familyCar = new Hashtag("FamilyCar");
        hashtagRepo.save(familyCar);
        hashtagRepo.save(fast);
        Review review1 = new Review("Honda", "Pilot", 2020, "You have more choices than ever for a three-row midsize SUV", "../images/2020-Honda-Pilot.jpg", suv, familyCar);
        Review review2 = new Review("Land Rover", "Range Rover", 2020, "Automakers typically redesign their vehicles every five to six years.", "../images/Range-Rover.jpg", suv);
        Review review3 = new Review("Chevrolet", "Corvette", 2020, "For 2020, the Corvette has undergone the most radical redesign", "../images/corvette.jpg", sportsCar);
        Review review4 = new Review("Porsche", "911", 2020, "Although the 2020 Porsche 911 kicks off a new generation", "../images/2020-porsche-911.jpg", sportsCar, fast);
        reviewRepo.save(review1);
        reviewRepo.save(review2);
        reviewRepo.save(review3);
        reviewRepo.save(review4);

    }
}
