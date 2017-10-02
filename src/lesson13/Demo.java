package lesson13;

import lesson4.*;
import lesson6.Car;
import lesson6.Order;
import lesson7.DemoHomeWork;
import lesson8.Adder;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        System.out.println("lesson4");
        System.out.println("lesson4.HomeWork");

        System.out.println(HomeWork.concat("1","2.3","3"));
        System.out.println(HomeWork.concat(null, "df", "df"));
        System.out.println(HomeWork.concat(null, "df", null));

        System.out.println();
        System.out.println("lesson4.HomeWork1");

        System.out.println(HomeWork1.findDivCount(Short.MAX_VALUE,Short.MIN_VALUE,0));
        System.out.println(HomeWork1.findDivCount((short) 0, (short) 0, 5));
        System.out.println(HomeWork1.findDivCount((short) 50, (short)7, Integer.MAX_VALUE));

        System.out.println();
        System.out.println("lesson4.HomeWork2");

        System.out.println(HomeWork2.sum(0, Integer.MAX_VALUE));
        System.out.println(HomeWork2.sum(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(HomeWork2.sum(Integer.MIN_VALUE, Integer.MAX_VALUE));

        System.out.println(HomeWork2.compareSums(0, Integer.MAX_VALUE, 45, Integer.MAX_VALUE));
        System.out.println(HomeWork2.compareSums(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, Integer.MAX_VALUE));
        System.out.println(HomeWork2.compareSums(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));

        System.out.println();
        System.out.println("lesson4.MethodExample");

        System.out.println(MethodExample.increaser(0, Integer.MAX_VALUE));
        System.out.println(MethodExample.increaser(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(MethodExample.increaser(Integer.MIN_VALUE, Integer.MAX_VALUE));

        System.out.println(MethodExample.min(0, Integer.MAX_VALUE));
        System.out.println(MethodExample.min(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(MethodExample.min(Integer.MIN_VALUE, Integer.MAX_VALUE));

        System.out.println();
        System.out.println("lesson4.PracticeExample");

        System.out.println(PracticeExample.min(0, Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(PracticeExample.min(Integer.MAX_VALUE, Integer.MIN_VALUE, 10));
        System.out.println(PracticeExample.min(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE));

        System.out.println(PracticeExample.average(50));
        System.out.println(PracticeExample.average(0));
        System.out.println(PracticeExample.average(-15));

        System.out.println(PracticeExample.average(50, 65));
        System.out.println(PracticeExample.average(0, 200));
        System.out.println(PracticeExample.average(-15, 400));

        System.out.println(PracticeExample.count(50, 65, 45));
        System.out.println(PracticeExample.count(0, 200,400));
        System.out.println(PracticeExample.count(-15, 400, Integer.MIN_VALUE));

        System.out.println("lesson5");
        System.out.println("lesson5.HomeWork");

        System.out.println(lesson5.HomeWork.uniqueCount(new int[]{11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11}));
        System.out.println(lesson5.HomeWork.uniqueCount(new int[]{11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11, Integer.MIN_VALUE}));
        System.out.println(lesson5.HomeWork.uniqueCount(new int[]{11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11, 465464, 7987, Integer.MIN_VALUE}));

        System.out.println();
        System.out.println("lesson5.HomeWork1");

        System.out.println(Arrays.toString(lesson5.HomeWork1.sortDescending((new int[]{11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11}))));
        System.out.println(Arrays.toString(lesson5.HomeWork1.sortDescending(new int[]{11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11, Integer.MAX_VALUE})));
        System.out.println(Arrays.toString(lesson5.HomeWork1.sortDescending(new int[]{11, 12, 10, 5, 4, 44, 0, 44, 11, 10, 11, 465464, 7987, Integer.MIN_VALUE})));

        System.out.println(Arrays.toString(lesson5.HomeWork1.sortAscending((new int[]{11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11}))));
        System.out.println(Arrays.toString(lesson5.HomeWork1.sortAscending(new int[]{11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11, Integer.MAX_VALUE})));
        System.out.println(Arrays.toString(lesson5.HomeWork1.sortAscending(new int[]{11, 12, 10, 5, 4, 44, 0, 44, 11, 10, 11, 465464, 7987, Integer.MIN_VALUE})));

        System.out.println();
        System.out.println("lesson5.HomeWork2");

        System.out.println(lesson5.HomeWork2.withdraw(new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"}, new int[]{100, 500, 8432, -100, 12000, -54, 0}, "Andrey", Integer.MAX_VALUE ));
        System.out.println(lesson5.HomeWork2.withdraw(new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"}, new int[]{100, 500, 8432, -100, 12000, -54, 0}, "Phil", Integer.MAX_VALUE ));
        System.out.println(lesson5.HomeWork2.withdraw(new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"}, new int[]{100, 500, 8432, -100, 12000, -54, 0}, "John", Integer.MIN_VALUE ));

        System.out.println(lesson5.HomeWork2.findClientIndexByName(new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"}, "Andrey"));
        System.out.println(lesson5.HomeWork2.findClientIndexByName(new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"}, "Phil"));
        System.out.println(lesson5.HomeWork2.findClientIndexByName(new String[]{"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"},  "Jack" ));

        System.out.println();
        System.out.println("lesson6.Order");

        Order order = new Order(5000, new Date(), false, null, "Kiev", "Ukraine", "Sold");
        order.confirmOrder();
        System.out.println(order.toString());

        order = new Order(Integer.MAX_VALUE, null, false, null, "Kiev", "Ukraine", "Sold");
        order.confirmOrder();
        System.out.println(order.toString());

        order = new Order(Integer.MAX_VALUE, new Date(), false, new Date(), "Kiev", "Ukraine", "Sold");
        order.confirmOrder();
        System.out.println(order.toString());

        System.out.println();
        System.out.println("lesson7.DemoHomeWork");

        DemoHomeWork demoHomeWork = new DemoHomeWork();
        System.out.println(demoHomeWork.createOrder().toString());
        System.out.println(demoHomeWork.createOrderAndCallMethods().toString());

        System.out.println();
        System.out.println("lesson8.Adder");

        System.out.println(Adder.add(Integer.MAX_VALUE, 1));
        System.out.println(Adder.add(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(Adder.add(Integer.MAX_VALUE, Integer.MAX_VALUE));

        System.out.println("lesson8.Arithmetic");
        System.out.println(Adder.check(new int[] {11, 12, 10, 5, 4, 44, 94, 44, 11, 10, 11}));
        System.out.println(Adder.check(new int[] {Integer.MIN_VALUE, 0, 0, 0, 0, 0, 11, Integer.MAX_VALUE}));
        System.out.println(Adder.check(new int[] {Integer.MAX_VALUE, 12, 10, 5, 4, 44, 94, 44, Integer.MAX_VALUE, 10, 11}));



    }

}
