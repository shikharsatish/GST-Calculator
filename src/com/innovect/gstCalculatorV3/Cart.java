package com.innovect.gstCalculatorV3;

import java.util.HashMap;
import java.util.Map;

public class Cart {
  public static Map<Product, Integer> products = new HashMap<>();

  public static void addProductToCart(Product product, int quantity) {
    products.put(product, quantity);
  }

  public static Map<Product, Integer> getCartItems() {
    return products;
  }
}
