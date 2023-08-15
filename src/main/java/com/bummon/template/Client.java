package com.bummon.template;

/**
 * @author Bummon
 * @description 模板方法模式 博客地址：http://blog.bummon.com/blog/3972415819.html
 * @date 2023-08-15 10:14
 */
public class Client {

    public static void main(String[] args) {
        HotelA hotelA = new HotelA();
        hotelA.checkInProcess();

        HotelB hotelB = new HotelB();
        hotelB.checkInProcess();
    }

}
