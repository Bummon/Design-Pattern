package com.bummon.visitor;

/**
 * @author Bummon
 * @description 具体访问者 博客地址：http://blog.bummon.com/blog/1689591513.html
 * @date 2023-08-15 11:06
 */
public class PrintCar implements Visitor {
    @Override
    public void visit(Engine engine) {
        System.out.println("访问发动机");
    }

    @Override
    public void visit(CarShell carShell) {
        System.out.println("访问外壳");
    }

    @Override
    public void visit(Car car) {
        System.out.println("访问汽车");
    }
}
