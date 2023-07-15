package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;


public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds("Cat", false);

        Assert.assertEquals(FoodType.TUNA, food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds("Hamster", false);

        Assert.assertEquals(FoodType.CABBAGE, food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds("Dog", false);

        Assert.assertEquals(FoodType.DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds("Cat", true);

        Assert.assertEquals(FoodType.SALMON, food);
    }

    @Test
    public void listOfColors() {
        // array is the simplest, used when you know the contents
        String[] color = {"red", "blue", "blue"};
        int[] ages = {1,2,3};
        // lists are used when you don't know the contents, can't store more then assigned number of elements i.e 4
        String[] moreColors = new String[3];
        moreColors[0] = "yellow";
        moreColors[1] = "purple";
        moreColors[2] = "pink";

        for( int i = 0; i < 3; i++) {
            System.out.println("Array = " + moreColors[i]);
        }

        // collections api in java is used when unknown number of elements is (lists, sets, maps)
        // lists are ordered seq of objects
        // List new ArrayList is a modern version of an array (primitive type)
        List<String> myColors = new ArrayList<>();
        myColors.add("red");
        myColors.add("blue");
        myColors.add("purple");
        myColors.add("red");

        for(String someColor: myColors) {
            System.out.println("Lists = " + someColor);
        }

        // sets unique items, just need a collection of object & order doesn't matter, can't have duplicates
        Set<String> myColorsInSet = new HashSet<>();
        myColorsInSet.add("red");
        myColorsInSet.add("blue");
        myColorsInSet.add("purple");
        myColorsInSet.add("red");

        for(String someColor: myColorsInSet) {
            System.out.println("Sets = " + someColor);
        }

        // maps are the most advanced structures


    }
}
