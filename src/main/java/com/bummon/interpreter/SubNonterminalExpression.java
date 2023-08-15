package com.bummon.interpreter;

/**
 * @author Bummon
 * @description
 * @date 2023-08-15 11:38
 */
public class SubNonterminalExpression extends TerminalExpression {
    public SubNonterminalExpression(AbstractExpression expressionA, AbstractExpression expressionB) {
        super(expressionA, expressionB);
    }

    public int interpret() {
        return this.expressionA.interpret() - this.expressionB.interpret();
    }
}
