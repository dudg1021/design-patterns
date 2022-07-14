package Struct_Mode.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @class: DynamicProxyHandler
 * @description:
 * @author: dudg
 * @create: 2022-07-13 17:39
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("拿着钱去买票");

        Object result = method.invoke(object, args);

        System.out.println("买完票坐上火车");

        return result;
    }
}
