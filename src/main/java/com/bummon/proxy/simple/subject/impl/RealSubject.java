package com.bummon.proxy.simple.subject.impl;

import com.bummon.proxy.simple.subject.Subject;

/**
 * @author Bummon
 * @description
 * @date 2023-08-14 17:30
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: 请求处理中");
    }
}
