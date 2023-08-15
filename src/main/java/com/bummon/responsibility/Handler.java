package com.bummon.responsibility;

import lombok.Data;

/**
 * @author Bummon
 * @description 抽象处理者角色 博客地址：http://blog.bummon.com/blog/1644716670.html
 * @date 2023-08-15 10:23
 */
@Data
public abstract class Handler {

    /**
     * 处理者姓名
     */
    protected String processorName;

    /**
     * 下一个处理者
     */
    protected Handler nextHandler;

    public Handler(String processorName) {
        this.processorName = processorName;
    }

    /**
     * @param name      请假人姓名
     * @param numOfDays 请假天数
     * @return {@link boolean}
     * @date 2023-08-15 10:26
     * @author Bummon
     * @description 处理请假抽象方法
     */
    public abstract boolean leave(String name, int numOfDays);

}
