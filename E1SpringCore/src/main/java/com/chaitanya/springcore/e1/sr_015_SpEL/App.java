package com.chaitanya.springcore.e1.sr_015_SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.chaitanya.springcore.e1.sr_015/config.xml");
        Square sq1 = context.getBean(Square.class);
        System.out.println(sq1);

        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("{55+66}");
        System.out.println(expression.getValue());
    }
}
