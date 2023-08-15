package com.bummon.mediator;

/**
 * @author Bummon
 * @description 具体同事角色 博客地址：http://blog.bummon.com/blog/3493201692.html
 * @date 2023-08-15 11:52
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
        this.mediator.setColleagueB(this);
    }

    /**
     * 自有方法
     */
    public void selfMethodB() {
        System.out.println("同事B收到中介协作通知");
    }

    /**
     * 依赖方法
     */
    public void depMethodB() {
        System.out.println(this.getClass().getSimpleName() + " depMethodB通知中介者进行转发协作");
        // 中介者进行转发协作
        this.mediator.transferB();
    }

}
