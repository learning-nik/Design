package com.rules.driver;

import com.rules.common.Cart;
import com.rules.common.Product;
import com.rules.common.ProductCategory;
import com.rules.common.ProductItem;

import com.rules.service.RulesService;
import java.util.List;

public class RulesDriver {

    public static void main(String[] args) {


        Product product1 = new Product("Shirt", ProductCategory.CLOTHES);
        Product product2 = new Product("Paracematol", ProductCategory.MEDICINE);

        ProductItem productItem = new ProductItem();
        productItem.product= product1;
        productItem.quantity =9;

        ProductItem productItem2 = new ProductItem();
        productItem2.product= product2;
        productItem2.quantity =3;

        Cart cart = new Cart();
        cart.items= List.of(productItem,productItem2);

        RulesService service = new RulesService();
        service.evaluate(cart);





    }

}
