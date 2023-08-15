package com.bummon.visitor;

/**
 * @author Bummon
 * @description 访问者模式 博客地址：http://blog.bummon.com/blog/1689591513.html
 * @date 2023-08-15 11:09
 */
public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        car.addVisit(new Engine());
        car.addVisit(new CarShell());

        Visitor print = new PrintCar();
        car.show(print);
    }

}
