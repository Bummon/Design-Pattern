package com.bummon.factory.abstraction.family.product.concrete;

import com.bummon.factory.abstraction.family.product.StapleFood;

/**
 * @author Bummon
 * @description 具体产品 博客地址：https://blog.bummon.com/blog/1417187187.html
 * @date 2023-08-14 14:48
 */
public class Noodles extends StapleFood {
    @Override
    public void description() {
        System.out.println("面条");
    }
}
