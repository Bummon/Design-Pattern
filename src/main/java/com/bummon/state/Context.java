package com.bummon.state;

/**
 * @author Bummon
 * @description 上下文角色 博客地址：http://blog.bummon.com/blog/2328566134.html
 * @date 2023-08-15 10:56
 */
public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void handle() {
        this.state.handle();
    }
}
