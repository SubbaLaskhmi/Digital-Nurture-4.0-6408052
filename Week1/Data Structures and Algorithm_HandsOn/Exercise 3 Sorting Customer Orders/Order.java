package SortingCustomerOrders;

public class Order {
	private String orderId;
    private String customerName;
    private double totalPrice;
    public Order(String orderId, String customerName, double totalPrice) 
    {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
    public double getTotalPrice() 
    {
        return totalPrice;
    }

    public String toString() 
    {
        return "OrderID: " + orderId + ", Customer: " + customerName + ", Total: ₹" + totalPrice;
    }
    
    public static void bubbleSort(Order[] orders) 
    {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }
    
    public static void quickSort(Order[] orders) 
    {
        quickSortRecursive(orders, 0, orders.length - 1);
    }

    private static void quickSortRecursive(Order[] orders, int low, int high) 
    {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSortRecursive(orders, low, pi - 1);
            quickSortRecursive(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) 
    {
        double pivot = orders[high].getTotalPrice();
        int i = low - 1;

        for (int j = low; j < high; j++) 
        {
            if (orders[j].getTotalPrice() <= pivot) 
            {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }
}