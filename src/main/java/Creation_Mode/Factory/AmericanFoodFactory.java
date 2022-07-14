package Creation_Mode.Factory;

/**
 * @class: ChineseFoodFactory
 * @description:
 * @author: dudg
 * @create: 2022-07-12 16:13
 */
public class AmericanFoodFactory implements FoodFactory {

    @Override
    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new AmericanFoodA();
        } else if (name.equals("B")) {
            return new AmericanFoodB();
        } else {
            return null;
        }
    }
}
