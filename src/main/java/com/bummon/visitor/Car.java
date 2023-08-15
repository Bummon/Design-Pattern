package com.bummon.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bummon
 * @description 对象结构角色 博客地址：http://blog.bummon.com/blog/1689591513.html
 * @date 2023-08-15 11:08
 */
public class Car {

    private List<Element> visit = new ArrayList<>();

    public void addVisit(Element element) {
        this.visit.add(element);
    }

    public void show(Visitor visitor) {
        this.visit.forEach(any -> any.accept(visitor));
    }

}
