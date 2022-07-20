package Behavior_Mode.Command;

/**
 * @class: SellStock
 * @description:
 * @author: dudg
 * @create: 2022-07-20 18:21
 */
public class SellStock implements Order{

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
