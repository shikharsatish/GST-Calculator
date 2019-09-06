package com.innovect.gstCalculatorV3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ServiceTest {
  Map<Product, Integer> map = new HashMap<>();
  Service service = new Service();
  Product cake = new Product(Category.FOOD, "Biscuit", 100, 10);
  Product tv = new Product(Category.ELECTRONICS, "tv", 1000, 2);
  Product chair = new Product(Category.FURNITURE, "chair", 500, 5);

  @Test
  public void totalBill() {
    map.put(cake, 10);
    map.put(tv, 2);
    map.put(chair, 5);

    assertEquals(1426, service.totalBill(map));
  }

  @Test
  public void discountOnBill() {
    assertEquals(123.2, service.discountOnBill(cake, 10));
  }
}