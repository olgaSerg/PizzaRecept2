package com.android.pizzarecipes2;

public class RecyclerViewPizza {
    private int imageResource;
    private String text;
    private String recipe;

    public RecyclerViewPizza(int imageResource, String text, String recipe) {
        this.imageResource = imageResource;
        this.text = text;
        this.recipe = recipe;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getRecipe() {
        return recipe;
    }

    public String getText() {
        return text;
    }

}
