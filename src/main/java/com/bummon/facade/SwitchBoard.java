package com.bummon.facade;

import com.bummon.facade.subsystem.CircuitA;
import com.bummon.facade.subsystem.CircuitB;
import com.bummon.facade.subsystem.CircuitC;

/**
 * @author Bummon
 * @description 外观角色  博客地址：http://blog.bummon.com/blog/1968982699.html
 * @date 2023-08-14 18:05
 */
public class SwitchBoard {

    private final CircuitA circuitA = new CircuitA();
    private final CircuitB circuitB = new CircuitB();
    private final CircuitC circuitC = new CircuitC();

    public void start() {
        circuitA.start();
        circuitB.start();
        circuitC.start();
    }

}
