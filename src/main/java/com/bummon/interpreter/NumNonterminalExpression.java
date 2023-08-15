package com.bummon.interpreter;

/**
 * @author Bummon
 * @description 非终止符表达式 博客地址http://blog.bummon.com/blog/818875602.html
 * @date 2023-08-15 11:41
 */
public class NumNonterminalExpression implements AbstractExpression {
    private int value;

    public NumNonterminalExpression(int value) {
        this.value = value;
    }

    public int interpret() {
        return this.value;
    }
}
