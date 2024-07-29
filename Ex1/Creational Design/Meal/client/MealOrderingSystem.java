package client;

import builder.MealBuilder;
import builder.VegetarianMealBuilder;
import builder.NonVegetarianMealBuilder;
import director.MealDirector;
import meal.Meal;
/**
 *
 * @author DELL
 */
public class MealOrderingSystem {
    public static void main(String[] args) {
        // Construct a vegetarian meal
        MealBuilder vegMealBuilder = new VegetarianMealBuilder();
        MealDirector vegMealDirector = new MealDirector(vegMealBuilder);
        vegMealDirector.constructMeal();
        Meal vegMeal = vegMealDirector.getMeal();
        System.out.println("Vegetarian Meal: " + vegMeal);

        // Construct a non-vegetarian meal
        MealBuilder nonVegMealBuilder = new NonVegetarianMealBuilder();
        MealDirector nonVegMealDirector = new MealDirector(nonVegMealBuilder);
        nonVegMealDirector.constructMeal();
        Meal nonVegMeal = nonVegMealDirector.getMeal();
        System.out.println("Non-Vegetarian Meal: " + nonVegMeal);
    }
}
