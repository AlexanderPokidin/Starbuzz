package com.example.alex.starbuzz;

/**
 * Created by ALEX on 01.07.2017.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
        new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
        new Drink("Cappuccino", "Espresso, hot milk, and steamed milk foam", R.drawable.cappuccino),
        new Drink("Filter", "Haghest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
