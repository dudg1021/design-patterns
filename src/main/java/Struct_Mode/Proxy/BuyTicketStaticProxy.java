package Struct_Mode.Proxy;

/**
 * @class: BuyTicketProxy
 * @description:
 * @author: dudg
 * @create: 2022-07-13 17:21
 */
public class BuyTicketStaticProxy implements BuyTicket {

    private BuyTicket buyTicket;

    public BuyTicketStaticProxy(BuyTicket buyTicket) {
        this.buyTicket = buyTicket;
    }

    @Override
    public void butTicket() {

        System.out.println("买票前。。。。");

        buyTicket.butTicket();

        System.out.println("买票后。。。。");
    }
}
