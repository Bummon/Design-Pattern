package com.bummon.strategy;

/**
 * @author Bummon
 * @description 策略模式 博客地址：http://blog.bummon.com/blog/1927526001.html
 * @date 2023-08-15 10:20
 */
public class Client {

    public static void main(String[] args) {
        //使用微信支付
        PayContext wechatPay = new PayContext(new WechatPay());
        wechatPay.payment();

        //使用支付宝支付
        PayContext alipay = new PayContext(new Alipay());
        alipay.payment();

        //使用现金支付
        PayContext cashPay = new PayContext(new CashPay());
        cashPay.payment();

    }

}
