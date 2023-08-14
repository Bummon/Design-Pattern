package com.bummon.facade;

/**
 * @author Bummon
 * @description 外观模式  博客地址：http://blog.bummon.com/blog/1968982699.html
 * @date 2023-08-14 18:07
 */
public class Client {

    public static void main(String[] args) {
        SwitchBoard switchBoard = new SwitchBoard();
        switchBoard.start();
    }

}
