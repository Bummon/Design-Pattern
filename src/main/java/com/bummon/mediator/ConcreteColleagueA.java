package com.bummon.mediator;

/**
 * @author Bummon
 * @description 具体同事角色 博客地址：http://blog.bummon.com/blog/3493201692.html
 * @date 2023-08-15 11:52
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
        this.mediator.setColleagueA(this);
    }

    /**
     * 自有方法
     */
    public void selfMethodA() {
        System.out.println("同事A收到中介协作通知");
    }

    /**
     * 依赖方法
     */
    public void depMethodA() {
        System.out.println(this.getClass().getSimpleName() + " depMethodA通知中介者进行转发协作");
        // 中介者进行转发协作
        this.mediator.transferA();
    }

}
