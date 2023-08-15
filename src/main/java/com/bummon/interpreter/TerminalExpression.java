package com.bummon.interpreter;

/**
 * @author Bummon
 * @description 终止符表达式 博客地址：http://blog.bummon.com/blog/818875602.html
 * @date 2023-08-15 11:35
 */
public abstract class TerminalExpression implements AbstractExpression {
    protected AbstractExpression expressionA;
    protected AbstractExpression expressionB;

    public TerminalExpression(AbstractExpression expressionA, AbstractExpression expressionB) {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }
}
