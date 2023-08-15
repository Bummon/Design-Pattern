package com.bummon.iterator;

/**
 * @author Bummon
 * @description 抽象迭代器
 * @date 2023-08-15 10:40
 */
public interface Iterator {

    boolean hasNext();

    Patient next();

}
