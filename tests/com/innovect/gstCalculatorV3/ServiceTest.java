package com.innovect.gstCalculatorV3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ServiceTest {
  Map<Product, Integer> map = new HashMap<>();
  Service service = new Service();
  Product cake = new Product(Category.FOOD, "Biscuit", 10, 10);
  Product tv = new Product(Category.ELECTRONICS, "tv", 100, 5);
  Product chair = new Product(Category.FURNITURE, "chair", 200, 7);

  @Test
  public void totalBill() {
    map.put(cake, 2);
    map.put(tv, 2);
    map.put(chair, 6);

    assertEquals(1384.0, service.totalBill(map), 0);
  }

  @Test
  public void discountOnBill() {
    assertEquals(123.2, service.discountOnBill(cake, 10));
  }
}