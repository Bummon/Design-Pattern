package com.bummon.iterator;

/**
 * @author Bummon
 * @description 抽象聚合类 博客地址：http://blog.bummon.com/blog/2421543447.html
 * @date 2023-08-15 10:37
 */
public interface Aggregate {

    void add(Patient patient);

    void remove(Patient patient);

    PatientIterator createPatientIterator();

}
