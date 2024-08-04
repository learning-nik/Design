package com.rules.service;

import com.rules.common.ProductCategory;
import com.rules.common.ProductItem;
import com.rules.common.Rule_Category;
import java.util.Map;

class CategoryRule extends Rule {

    public CategoryRule(
            String id,
            ProductCategory productCategory,
            Map<String, Integer> ruleExpression) {
        super(id, Rule_Category.QUANTITY_PER_CATEGORY, productCategory, ruleExpression);
    }

    protected boolean evaluate(ProductItem item) {

        int min = ruleExpression.get("min");
        int max = ruleExpression.get("max");

        if (item.quantity >= min && item.quantity <= max) {
            return true;
        }

        return false;
    }

}
