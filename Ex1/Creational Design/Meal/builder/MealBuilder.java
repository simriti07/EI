package builder;

import meal.Meal;
/**
 *
 * @author DELL
 */
public abstract class MealBuilder {
    protected Meal meal = new Meal();

    public abstract void buildMainCourse();
    public abstract void buildSideDish();
    public abstract void buildDrink();
    public abstract void buildDessert();

    public Meal getMeal() {
        return meal;
    }
}
