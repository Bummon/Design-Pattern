package com.bummon.state;

/**
 * @author Bummon
 * @description 状态模式 博客地址：http://blog.bummon.com/blog/2328566134.html
 * @date 2023-08-15 11:02
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new UnpaidState());
        System.out.println("-----用户确认订单-----");
        context.handle();
        System.out.println("-------商家发货-------");
        context.handle();
        System.out.println("-----用户确认收货-----");
        context.handle();
    }

}
