package ru.alfa.starter;

import org.springframework.context.annotation.Conditional;

@Conditional(OnProdCondition.class)
public @interface ConditionalOnProduction {
}
