package com.bummon.adapter.object;

/**
 * @author Bummon
 * @description 对象适配器  博客地址：http://blog.bummon.com/blog/4123342314.html
 * @date 2023-08-14 16:51
 */
public class Client {

    public static void main(String[] args) {
        Target target = new Target(new Adaptee());
        if ("lighting".equals(target.lighting())) {
            System.out.println("可以尽情听歌了");
        } else {
            System.out.println("耳机口不为lighting，无法听歌");
        }
    }

}
