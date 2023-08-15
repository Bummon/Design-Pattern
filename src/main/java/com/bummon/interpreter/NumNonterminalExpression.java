package com.bummon.interpreter;

/**
 * @author Bummon
 * @description
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
