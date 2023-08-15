package com.bummon.template;

/**
 * @author Bummon
 * @description 具体子类 博客地址：http://blog.bummon.com/blog/3972415819.html
 * @date 2023-08-15 10:13
 */
public class HotelA extends CheckInHotel {
    @Override
    protected void chooseHotel() {
        System.out.println("选择酒店A");
    }

    @Override
    protected void pay() {
        System.out.println("使用支付宝支付");
    }
}
