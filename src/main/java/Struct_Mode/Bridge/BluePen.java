package Struct_Mode.Bridge;

/**
 * @class: BluePen
 * @description:
 * @author: dudg
 * @create: 2022-07-14 17:55
 */
public class BluePen implements DrawApi {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用蓝色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
