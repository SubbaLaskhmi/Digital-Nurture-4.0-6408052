package InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        IInventoryManager inventory = new InventoryManager();
        Product p1 = new Product("P001", "Pen", 100, 10.0);
        Product p2 = new Product("P002", "Notebook", 50, 30.0);
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        System.out.println("All products:");
        ((InventoryManager) inventory).listAllProducts();
        System.out.println("\nGet Product P001:");
        System.out.println(inventory.getProduct("P001"));
        p1.setPrice(12.5);
        inventory.updateProduct(p1);
        System.out.println("\nAfter update:");
        ((InventoryManager) inventory).listAllProducts();
        inventory.deleteProduct("P002");
        System.out.println("\nAfter deletion:");
        ((InventoryManager) inventory).listAllProducts();
    }
}