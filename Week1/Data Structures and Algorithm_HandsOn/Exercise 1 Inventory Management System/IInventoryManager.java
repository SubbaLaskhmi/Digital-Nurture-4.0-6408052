package InventoryManagementSystem;

public interface IInventoryManager {
	void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(String productId);
    Product getProduct(String productId);
}