package com.bummon.bridge;

import com.bummon.bridge.abstraction.Shape;
import com.bummon.bridge.abstraction.impl.Circle;
import com.bummon.bridge.abstraction.impl.Rectangle;
import com.bummon.bridge.implementor.impl.PaperDrawApi;
import com.bummon.bridge.implementor.impl.ScreenDrawApi;

/**
 * @author Bummon
 * @description 桥接模式  博客地址：http://blog.bummon.com/blog/2068909584.html
 * @date 2023-08-14 17:55
 */
public class Client {

    public static void main(String[] args) {
        ScreenDrawApi screenDrawApi = new ScreenDrawApi();
        PaperDrawApi paperDrawApi = new PaperDrawApi();

        //在屏幕上绘制
        Shape circle1 = new Circle(screenDrawApi);
        circle1.draw();
        Shape rectangle1 = new Rectangle(screenDrawApi);
        rectangle1.draw();

        //在纸上绘制
        Shape circle2 = new Circle(paperDrawApi);
        circle2.draw();
        Shape rectangle2 = new Rectangle(paperDrawApi);
        rectangle2.draw();
    }

}
