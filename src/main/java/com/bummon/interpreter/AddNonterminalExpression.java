package com.bummon.interpreter;

/**
 * @author Bummon
 * @description
 * @date 2023-08-15 11:37
 */
public class AddNonterminalExpression extends TerminalExpression {
    public AddNonterminalExpression(AbstractExpression expressionA, AbstractExpression expressionB) {
        super(expressionA, expressionB);
    }

    public int interpret() {
        return this.expressionA.interpret() + this.expressionB.interpret();
    }
}
