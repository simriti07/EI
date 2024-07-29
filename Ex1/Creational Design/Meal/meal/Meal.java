package meal;

/**
 *
 * @author DELL
 */
public class Meal {
    private String mainCourse;
    private String sideDish;
    private String drink;
    private String dessert;

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Meal [Main Course=" + mainCourse + ", Side Dish=" + sideDish + 
               ", Drink=" + drink + ", Dessert=" + dessert + "]";
    }
}
