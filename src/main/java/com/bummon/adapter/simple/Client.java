package com.bummon.adapter.simple;

/**
 * @author Bummon
 * @description 调用者 博客地址：http://blog.bummon.com/blog/4123342314.html
 * @date 2023-08-14 16:33
 */
public class Client {

    public static void main(String[] args) {
        listen(new Target());
    }

    public static void listen(Target target) {
        if ("lighting".equals(target.lighting())) {
            System.out.println("可以尽情听歌了");
        } else {
            System.out.println("耳机口不为lighting，无法听歌");
        }
    }

}
