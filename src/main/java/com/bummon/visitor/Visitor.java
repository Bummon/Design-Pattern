package com.bummon.visitor;


/**
 * @author Bummon
 * @description 抽象访问者 博客地址：http://blog.bummon.com/blog/1689591513.html
 * @date 2023-08-15 11:04
 */
public interface Visitor {

    void visit(Engine engine);

    void visit(CarShell carShell);

    void visit(Car car);

}
