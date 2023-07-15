package com.serenitydojo;

public class Hamster extends Pet {

    String wheel;
    public Hamster(String hazel, int i, String wheel) {
        super(hazel, i);
        this.wheel = wheel;
    }

    @Override
    public String play() {
        return "runs with wheels";
    }
}
