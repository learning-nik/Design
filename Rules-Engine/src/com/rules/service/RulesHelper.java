package com.rules.service;

import com.rules.common.ProductCategory;
import com.rules.common.ProductItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RulesHelper {

    private static final List<Rule> rules = new ArrayList<>();

    static {
        Map<String, Integer> expression = new HashMap<>();
        expression.put("min", 2);
        expression.put("max", 10);
        Rule rule1 = new CategoryRule("123", ProductCategory.MEDICINE, expression);

        Map<String, Integer> expression2 = new HashMap<>();
        expression2.put("min", 1);
        expression2.put("max", 5);
        Rule rule2 = new CategoryRule("123", ProductCategory.CLOTHES, expression);

        Map<String, Integer> expression3 = new HashMap<>();
        expression3.put("min", 1);
        expression3.put("max", 5);
        Rule rule3 = new QuantityRule("123", expression);

        rules.add(rule1);
        rules.add(rule2);
        rules.add(rule3);
    }

    public static List<Rule> getAllRules() {
        return rules;
    }


    public static List<Rule> getApplicableRule(ProductItem productItem) {

        List<Rule> applicableRules = new ArrayList<>();

        for (Rule rule : rules) {

            if (rule.productCategory == null || productItem.product.category == rule.productCategory) {
                applicableRules.add(rule);
            }
        }

        System.out.println("Applicable roles are" + applicableRules);

        return applicableRules;

    }

}
