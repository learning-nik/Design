package com.rules.service;

import com.rules.common.Cart;
import com.rules.common.ProductItem;

public class RulesService {

    public boolean evaluate(Cart cart) {

        for (ProductItem item : cart.items) {
            var rules = RulesHelper.getApplicableRule(item);

            for (Rule rule : rules) {
                boolean isNotBreaching = rule.evaluate(item);
                if (!isNotBreaching) {
                    System.out.println("Rule not matched: "+rule);
                    return false;
                }
            }

        }

        System.out.println("All Rules matched");
        return false;

    }

}
