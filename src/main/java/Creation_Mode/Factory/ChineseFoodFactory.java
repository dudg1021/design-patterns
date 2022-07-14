package Creation_Mode.Factory;

/**
 * @class: ChineseFoodFactory
 * @description:
 * @author: dudg
 * @create: 2022-07-12 16:13
 */
public class ChineseFoodFactory implements FoodFactory {

    @Override
    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new ChineseFoodA();
        } else if (name.equals("B")) {
            return new ChineseFoodB();
        } else {
            return null;
        }
    }
}
