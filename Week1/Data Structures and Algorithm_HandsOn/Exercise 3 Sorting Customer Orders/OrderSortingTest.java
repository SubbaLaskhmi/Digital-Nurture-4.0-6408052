package SortingCustomerOrders;

public class OrderSortingTest {
	public static void main(String[] args) 
	{
        Order[] orders = {new Order("O101", "Alice", 3000.0),
            new Order("O102", "Bob", 1200.0),
            new Order("O103", "Charlie", 5000.0),
            new Order("O104", "David", 2500.0)};
        System.out.println("Original Orders:");
        for (Order o : orders) {
        	System.out.println(o);
        }
        System.out.println("\nSorted by Bubble Sort:");
        Order.bubbleSort(orders);
        for (Order o : orders) {
        	System.out.println(o);
        }
        
        Order[] newOrders = {new Order("O101", "Alice", 3000.0),
            new Order("O102", "Bob", 1200.0),
            new Order("O103", "Charlie", 5000.0),
            new Order("O104", "David", 2500.0)};
        
        System.out.println("\nSorted by Quick Sort:");
        Order.quickSort(newOrders);
        for (Order o : newOrders) 
        {
        	System.out.println(o);
        }
    }
}