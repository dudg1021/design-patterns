package Behavior_Mode.Command;

/**
 * @class: BuyStock
 * @description:
 * @author: dudg
 * @create: 2022-07-20 18:21
 */
public class BuyStock implements Order{

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
