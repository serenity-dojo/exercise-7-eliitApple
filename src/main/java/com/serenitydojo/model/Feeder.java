package com.serenitydojo.model;

import static com.serenitydojo.model.FoodType.*;

public class Feeder {
    public FoodType feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            return (isPremium) ? SALMON : TUNA;
        } else if (animal.equals("Dog")) {
            return DOG_FOOD;
        }

        return CABBAGE;

    }
}
