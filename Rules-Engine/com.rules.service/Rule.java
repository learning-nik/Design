package com.rules.service;

import com.rules.common.ProductCategory;
import com.rules.common.ProductItem;
import com.rules.common.Rule_Category;
import java.util.Map;

public abstract class Rule {

    public String id;
    public Rule_Category ruleCategory;

    public ProductCategory productCategory;


    public Map<String, Integer> ruleExpression;


    protected Rule(String id, Rule_Category ruleCategory, ProductCategory productCategory,
            Map<String, Integer> ruleExpression) {
        this.id = id;
        this.ruleCategory = ruleCategory;
        this.productCategory = productCategory;
        this.ruleExpression = ruleExpression;
    }

    protected abstract boolean evaluate(ProductItem item);

    @Override
    public String toString() {
        return "Rule{" +
                "id='" + id + '\'' +
                ", ruleCategory=" + ruleCategory +
                ", productCategory=" + productCategory +
                ", ruleExpression=" + ruleExpression +
                '}';
    }


}

