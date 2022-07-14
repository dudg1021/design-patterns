package Creation_Mode.Factory;

/**
 * @class: main
 * @description:
 * @author: dudg
 * @create: 2022-07-12 16:18
 */
public class Main {

    /**
     * 工厂方法模式：对简单工厂模式进一步延伸，针对不同类型对象创建不同的工厂，每个工厂创建同一类对象
     * 解决单一对象创建问题，避免增加类型修改工厂类
     * @param args
     */
    public static void main(String[] args) {

        FoodFactory chineseFoodFactory = new ChineseFoodFactory();
        Food chineseFood = chineseFoodFactory.makeFood("A");
        System.out.println(chineseFood.getName());

        FoodFactory americanFoodFactory = new AmericanFoodFactory();
        Food americanFood = americanFoodFactory.makeFood("A");
        System.out.println(americanFood.getName());
    }
}
