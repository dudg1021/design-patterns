package Behavior_Mode.Command;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2022-07-20 18:23
 */
public class Main {

    /**
     * 命令模式：将一哥请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
     * @param args
     */
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
