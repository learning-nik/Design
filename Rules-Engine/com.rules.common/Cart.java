package com.rules.common;

import java.util.List;

public class Cart {

    public List<ProductItem> items;
    // other things like price etc
}

// similarly add classes for other rules


/*class RuleFactory {

    *//*Rule rule;

    RuleFactory(Rule rule) {
        this.rule = rule;
    }*//*

    public static Rule getRule(Rule_Category category) {
        if (category == Rule_Category.QUANTITY) {
            return new Rule.QuantityRule();
        }
        //TODO:// and so on
        return null;
    }
}*/


