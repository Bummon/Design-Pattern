package com.bummon.state;

/**
 * @author Bummon
 * @description
 * @date 2023-08-15 10:59
 */
public class UnshippedState extends State {
    @Override
    public void handle() {
        System.out.println("当前订单状态为 [待发货]");
        System.out.println("发货成功");
        super.getContext().setState(new UnreceivedState());
    }
}
