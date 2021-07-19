package com.company;

public class Main {

    public static void main(String[] args) {
//	    TaskMenu newFile = TaskMenu.FILE;
//        TaskMenu newEdit = TaskMenu.EDIT;
//        TaskMenu newView = TaskMenu.VIEW;
//        System.out.println("The first Item of " + newFile + " is " + newFile.getFirstItem());
//        System.out.println("The first Item of " + newEdit + " is " + newEdit.getFirstItem());
//        System.out.println("The first Item of " + newView + " is " + newView.getFirstItem());

        RestaurantMenu newAppetizer = RestaurantMenu.Appetizer;
        RestaurantMenu newMainCourse = RestaurantMenu.MainCourse;
        RestaurantMenu newDessert = RestaurantMenu.Dessert;
        System.out.println("The first meal in " + newAppetizer + " is " + newAppetizer.getFirstMeal());
        System.out.println("The first meal in " + newMainCourse + " is " + newMainCourse.getFirstMeal());
        System.out.println("The second meal in " + newDessert + " is " + newDessert.getSecondMeal());

        // Create a project to model 5 mathematical
        // constants.
        // UML
        // Model a school hierarchy
        // Person, Students, Principal, Teachers, Janitors.
        // https://diagrams.net


    }

    // Create an Enum to model a restaurant menu.
    // The offer 3 categories of items. Appetizer, Main Course, Dessert.
    // Appetizer - Steamed Prawns and cafe latte
    // Main Course - Continental Rice and Deep Fried Chicken.
    // Dessert - Cupcakes and Milk chocolate ice cream.
    // Use your main method to out the result.


}
