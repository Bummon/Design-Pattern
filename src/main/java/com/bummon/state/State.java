package com.bummon.state;

/**
 * @author Bummon
 * @description 抽象状态角色 博客地址：http://blog.bummon.com/blog/2328566134.html
 * @date 2023-08-15 10:54
 */
public abstract class State {

    private Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle();

}
