package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class ReviewStorage {
    Map<String, Review> reviews = new HashMap<>();
    public ReviewStorage() {
        reviews.put("Honda", new Review("Honda", "Pilot", 2020, "You have more choices than ever for a three-row midsize SUV, yet the\n" +
                "        Honda Pilot, a mainstay of the class, remains one of the best choices\n" +
                "        available. You'll enjoy roomy seating for up to eight, a quiet interior\n" +
                "        and a comfortable ride quality. The plush accommodations don't come at\n" +
                "        the expense of performance either since the Pilot is surprisingly\n" +
                "        capable when driven on twisty roads. And while we're not totally\n" +
                "        enamored with the optional nine-speed automatic transmission, there's no\n" +
                "        doubt the standard V6 has plenty of power to move this large crossover.", "/src/main/resources/static/images/2020-Honda-Pilot.jpg"));

        reviews.put("Land Rover",new Review("Land Rover", "Range Rover", 2020, "Automakers typically redesign their vehicles every five to six years.\n" +
                "        But push the life cycle longer, and they run the risk of having an\n" +
                "        overly dated product. Land Rover hasn't fully redesigned its Range Rover\n" +
                "        Sport since the 2014 model year. Compared to some newer luxury SUVs\n" +
                "        (including some even in Land Rover's own lineup), the Sport might come\n" +
                "        across as a little dated. Thankfully, there have been enough recent\n" +
                "        updates to keep the 2020 Range Rover Sport a viable pick. The Sport may\n" +
                "        be an old-timer, but it looks just as fresh as the brand's newer SUVs.\n" +
                "        Credit is due in part to a significant refresh in 2018 that updated the\n" +
                "        interior with a new infotainment system, a secondary touchscreen for the\n" +
                "        climate controls, and more. And late last year, Land Rover swapped out\n" +
                "        the previous supercharged V6 engine for a new turbocharged inline-six\n" +
                "        engine. This engine, thanks to a mild hybrid system, is more\n" +
                "        fuel-efficient while still maintaining a robust amount of power.", "/src/main/resources/static/images/Range-Rover.jpg"));

    }
    public Review findReviewByTitle(String reviewTitle) {
        return reviews.get(reviewTitle);
    }
}
