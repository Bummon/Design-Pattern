package com.bummon.state;

/**
 * @author Bummon
 * @description
 * @date 2023-08-15 10:58
 */
public class UnpaidState extends State {

    @Override
    public void handle() {
        System.out.println("当前订单状态为 [待支付]");
        System.out.println("支付成功");
        super.getContext().setState(new UnshippedState());
    }
}
