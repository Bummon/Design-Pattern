package com.bummon.visitor;

/**
 * @author Bummon
 * @description 抽象元素  博客地址：http://blog.bummon.com/blog/1689591513.html
 * @date 2023-08-15 11:07
 */
public interface Element {

    void accept(Visitor visitor);

}
