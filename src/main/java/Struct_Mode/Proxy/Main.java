package Struct_Mode.Proxy;

import java.lang.reflect.Proxy;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2022-07-13 17:29
 */
public class Main {

    /**
     * 代理模式， 方法增强
     * @param args
     */
    public static void main(String[] args) {

        BuyTicket buyTicket = new BuyTicketImpl();

        // 静态代理
        //BuyTicketStaticProxy buyTicketStaticProxy = new BuyTicketStaticProxy(buyTicket);
        //buyTicketStaticProxy.butTicket();


        // JDK动态代理
        BuyTicket buyTicketDynamicProxy = (BuyTicket) Proxy.newProxyInstance(BuyTicket.class.getClassLoader(), new Class[]{BuyTicket.class}, new DynamicProxyHandler(buyTicket));
        buyTicketDynamicProxy.butTicket();


    }

}
