package com.bummon.template;

/**
 * @author Bummon
 * @description 抽象类角色 博客地址：http://blog.bummon.com/blog/3972415819.html
 * @date 2023-08-15 10:09
 */
public abstract class CheckInHotel {

    protected final void checkInProcess() {
        //选择酒店
        this.chooseHotel();
        //验证身份
        this.verifyIdentity();
        //付钱
        this.pay();
        //入住
        this.checkIn();
    }

    protected void verifyIdentity() {
        System.out.println("掏出身份证验证身份");
    }

    protected void checkIn() {
        System.out.println("入住酒店了");
    }

    protected abstract void chooseHotel();

    protected abstract void pay();

}
