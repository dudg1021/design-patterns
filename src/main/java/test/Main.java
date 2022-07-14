package test;

import java.util.HashMap;
import java.util.Map;

/**
 * @class: main
 * @description:
 * @author: dudg
 * @create: 2020-09-23 12:13
 */
public class Main {


    public static void main(String[] args) {

        Integer obj1 = 123;
        Integer obj2 = 123;
        Integer obj3 = 129;
        Integer obj4 = 429;

        Map<Integer,Integer> maps = new HashMap<>();
        maps.put(obj1,obj1);
        maps.put(obj2,obj1);
        maps.put(obj3,obj1);
        maps.put(obj4,obj1);



        System.out.println(maps.containsKey(obj1));
        System.out.println(maps.containsKey(obj3));
        System.out.println(maps.containsKey(Integer.valueOf(429)));

    }
}
