package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.storage.repositories.CategoryRepository;
import org.wecancodeit.reviews.entities.Category;

@Service
public class CategoryStorage {
    private CategoryRepository categoryRepo;

    public CategoryStorage(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
//        Review review1 = new Review("Honda", "Pilot", 2020, "You have more choices than ever for a three-row midsize SUV, yet the\n" +
//                "        Honda Pilot, a mainstay of the class, remains one of the best choices\n" +
//                "        available. You'll enjoy roomy seating for up to eight, a quiet interior\n" +
//                "        and a comfortable ride quality. The plush accommodations don't come at\n" +
//                "        the expense of performance either since the Pilot is surprisingly\n" +
//                "        capable when driven on twisty roads. And while we're not totally\n" +
//                "        enamored with the optional nine-speed automatic transmission, there's no\n" +
//                "        doubt the standard V6 has plenty of power to move this large crossover.", "/src/main/resources/static/images/2020-Honda-Pilot.jpg");
//        Review review2 = new Review("Land Rover", "Range Rover", 2020, "Automakers typically redesign their vehicles every five to six years.\n" +
//                "        But push the life cycle longer, and they run the risk of having an\n" +
//                "        overly dated product. Land Rover hasn't fully redesigned its Range Rover\n" +
//                "        Sport since the 2014 model year. Compared to some newer luxury SUVs\n" +
//                "        (including some even in Land Rover's own lineup), the Sport might come\n" +
//                "        across as a little dated. Thankfully, there have been enough recent\n" +
//                "        updates to keep the 2020 Range Rover Sport a viable pick. The Sport may\n" +
//                "        be an old-timer, but it looks just as fresh as the brand's newer SUVs.\n" +
//                "        Credit is due in part to a significant refresh in 2018 that updated the\n" +
//                "        interior with a new infotainment system, a secondary touchscreen for the\n" +
//                "        climate controls, and more. And late last year, Land Rover swapped out\n" +
//                "        the previous supercharged V6 engine for a new turbocharged inline-six\n" +
//                "        engine. This engine, thanks to a mild hybrid system, is more\n" +
//                "        fuel-efficient while still maintaining a robust amount of power.", "/src/main/resources/static/images/Range-Rover.jpg");
//        categories.put("SUV", new Category("SUV", new ArrayList<>(List.of(review1, review2))));
//        Review review3 = new Review("Porsche", "911", 2020, "Although the 2020 Porsche 911 kicks off a new generation — code-named\n" +
//                "        992 — it isn't wildly different from its 991 predecessor. If you want\n" +
//                "        that from your next sports car, Chevrolet will be happy to sell you a\n" +
//                "        mid-engine C8 Corvette. But the redesigned 2020 911 is more than up to\n" +
//                "        the challenge of subtly evolving Porsche's rear-engine icon. This new\n" +
//                "        911 picks up right where the old model left off by pairing\n" +
//                "        supercar-adjacent performance with everyday drivability. For now,\n" +
//                "        Porsche is offering just the Carrera and Carrera S versions, plus the\n" +
//                "        all-wheel-drive 4 and 4S versions. Engine horsepower is up slightly, and\n" +
//                "        the PDK automatic transmission now sports an extra gear. Bored with the\n" +
//                "        idea of just a \"regular\" Carrera? Just as the sun sets in the west, you\n" +
//                "        can bet that Porsche has its typical buffet of Turbos and GT3s queued up\n" +
//                "        in the pipeline for future model years.", "porsche");
//        Review review4 = new Review("Chevrolet", "Corvette", 2020, "For 2020, the Corvette has undergone the most radical redesign in its\n" +
//                "        67-year history. Believing that they had squeezed every ounce of\n" +
//                "        performance they could from the Corvette's classic front-engine and\n" +
//                "        rear-drive layout, Chevrolet's engineers decided a new mid-engine layout\n" +
//                "        was the way to go for its inherent advantages in weight distribution.\n" +
//                "        Risky? Yes. But the result is hugely impressive. In terms of\n" +
//                "        performance, the Corvette equals or outshines cars costing twice to\n" +
//                "        three times as much. The new 6.2-liter V8 and dual-clutch automatic\n" +
//                "        transmission are a formidable combo on the track but offer plenty of\n" +
//                "        oomph and smooth operation in nearly any condition. The 2020 Corvette\n" +
//                "        also imparts more information about its handling balance and grip,\n" +
//                "        thereby giving its driver more confidence in taking the car up to its\n" +
//                "        handling limits.", "corvette");
    }

    public Category findCategoryByName(String categoryName) {
        return categoryRepo.findByName(categoryName);
    }

    public Iterable<Category> findAllCategories() {
        return categoryRepo.findAll();
    }
}
