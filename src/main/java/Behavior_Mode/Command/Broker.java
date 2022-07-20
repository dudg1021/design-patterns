package Behavior_Mode.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @class: Broker
 * @description:
 * @author: dudg
 * @create: 2022-07-20 18:23
 */
public class Broker {

    private List<Order> orders = new ArrayList<>();

    /**
     * 接收订单
     * @param order
     */
    public void takeOrder(Order order){
        orders.add(order);
    }

    /**
     * 提交订单
     */
    public void placeOrders(){
        for (Order order : orders) {
            order.execute();
        }

        orders.clear();
    }
}
