/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import meal.Meal;
/**
 *
 * @author DELL
 */
public class VegetarianMealBuilder extends MealBuilder {
    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Vegetable Lasagna");
    }

    @Override
    public void buildSideDish() {
        meal.setSideDish("Salad");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Apple Juice");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Fruit Salad");
    }
}
