package com.bummon.interpreter;

/**
 * @author Bummon
 * @description
 * @date 2023-08-15 11:44
 */
public class Client {

    public static void main(String[] args) {
        // 创建上下文对象进行解释
        Context calculatorContext = new Context("1 + 4");
        // 获取执行结果
        System.out.println("calculatorContext.calculate() = " + calculatorContext.caculate());

        Context calculatorContext2 = new Context("1 + 4 - 5");
        System.out.println("calculatorContext.calculate() = " + calculatorContext2.caculate());
    }

}
