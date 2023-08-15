package com.bummon.interpreter;

import java.util.Stack;

/**
 * @author Bummon
 * @description 上下文对象 博客地址http://blog.bummon.com/blog/818875602.html
 * @date 2023-08-15 11:42
 */
public class Context {
    private Stack<AbstractExpression> stack = new Stack<AbstractExpression>();

    public Context(String expression) {
        this.parse(expression);
    }

    /**
     * 解析表达式
     */
    private void parse(String expression) {
        String[] elements = expression.split(" ");
        AbstractExpression expressionA, expressionB;

        for (int i = 0; i <elements.length; i++) {
            String operator = elements[i];
            if (Context.isOperator(operator)) {
                expressionA = this.stack.pop();
                System.out.println("出栈: " + expressionA.interpret());
                expressionB = new NumNonterminalExpression(Integer.valueOf(elements[++i]));
                TerminalExpression res = Context.util(expressionA, expressionB, operator);
                this.stack.push(res);
                System.out.println("计算: " + expressionA.interpret() + operator + expressionB.interpret());
                System.out.println("计算结果: " + res.interpret() + " 入栈");
            } else {
                NumNonterminalExpression numNonterminalExpression = new NumNonterminalExpression(Integer.valueOf(elements[i]));
                this.stack.push(numNonterminalExpression);
                System.out.println("入栈: " + numNonterminalExpression.interpret());
            }
        }
    }

    /**
     * 计算结果
     */
    public int caculate() {
        int interpret = this.stack.pop().interpret();
        System.out.println("计算结果为：" + interpret + " 出栈");
        return interpret;
    }

    /**
     * 计算结果
     */
    public static TerminalExpression util(AbstractExpression a, AbstractExpression b, String symbol) {
        if (symbol.equals("+")) {
            return new AddNonterminalExpression(a, b);
        } else if (symbol.equals("-")) {
            return new SubNonterminalExpression(a, b);
        } else {
            return null;
        }
    }

    public static boolean isOperator(String symbol) {
        return (symbol.equals("+") || symbol.equals("-"));
    }
}
