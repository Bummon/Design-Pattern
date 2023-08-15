package com.bummon.state;

/**
 * @author Bummon
 * @description
 * @date 2023-08-15 11:00
 */
public class UnreceivedState extends State {
    @Override
    public void handle() {
        System.out.println("当前订单状态为 [待收货]");
        System.out.println("收货成功");
        System.out.println("当前订单状态为 [已完成]");
    }
}
