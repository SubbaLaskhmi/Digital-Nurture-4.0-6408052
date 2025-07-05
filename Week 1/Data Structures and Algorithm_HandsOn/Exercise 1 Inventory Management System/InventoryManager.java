package InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager implements IInventoryManager {
	 private Map<String, Product> inventory = new HashMap<>();
	 public void addProduct(Product product) 
	 {
	     inventory.put(product.getProductId(), product);
	 }
	 public void updateProduct(Product product) 
	 {
	     inventory.put(product.getProductId(), product);
	 }
	 public void deleteProduct(String productId) 
	 {
	     inventory.remove(productId);
	 }
	 public Product getProduct(String productId) 
	 {
	     return inventory.get(productId);
	 }
	 public void listAllProducts() 
	 {
	     for (Product product : inventory.values()) 
	     {
	         System.out.println(product);
	     }
	 }
}