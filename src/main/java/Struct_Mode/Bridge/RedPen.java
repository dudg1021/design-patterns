package Struct_Mode.Bridge;

/**
 * @class: RedPen
 * @description:
 * @author: dudg
 * @create: 2022-07-14 17:54
 */
public class RedPen implements DrawApi{


    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用红色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
