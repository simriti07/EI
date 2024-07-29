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
public class NonVegetarianMealBuilder extends MealBuilder {
    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Grilled Chicken");
    }

    @Override
    public void buildSideDish() {
        meal.setSideDish("Mashed Potatoes");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Cola");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Ice Cream");
    }
}