package com.company;

public enum RestaurantMenu {
    Appetizer("Steamed Prawns", "Latte"),
    MainCourse("Continental Rice", "Deep Fried Chicken"),
    Dessert("Cupcakes", "Milk chocolate ice cream");

    private final String firstMeal;
    private final String secondMeal;


    RestaurantMenu(String firstMeal, String secondMeal) {
        this.firstMeal = firstMeal;
        this.secondMeal = secondMeal;
    }

    public String getFirstMeal() {
        return firstMeal;
    }

    public String getSecondMeal() {
        return secondMeal;
    }
}
