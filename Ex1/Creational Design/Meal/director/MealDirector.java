package director;

import builder.MealBuilder;
import meal.Meal;
/**
 *
 * @author DELL
 */
public class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void constructMeal() {
        mealBuilder.buildMainCourse();
        mealBuilder.buildSideDish();
        mealBuilder.buildDrink();
        mealBuilder.buildDessert();
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }
}
