package com.bummon.mediator;

/**
 * @author Bummon
 * @description 抽象同事角色 博客地址：http://blog.bummon.com/blog/3493201692.html
 * @date 2023-08-15 11:51
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}
