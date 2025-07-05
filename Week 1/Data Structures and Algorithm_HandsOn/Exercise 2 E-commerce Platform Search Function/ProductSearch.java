package EcommercePlatformSearchFunction;

import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {
	public static int linearSearch(Product[] products, String key) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(Product[] products, String key) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(key);
            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Product[] products = { new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Chair", "Furniture"),
            new Product("P003", "Pen", "Stationery"),
            new Product("P004", "Notebook", "Stationery"),
            new Product("P005", "Mobile", "Electronics")
        };
        String searchKey = "Notebook";
        int linearIndex = linearSearch(products, searchKey);
        if (linearIndex != -1) {
            System.out.println("Linear Search: Found at index " + linearIndex);
            System.out.println(products[linearIndex]);
        } else {
            System.out.println("Linear Search: Product not found.");
        }
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        int binaryIndex = binarySearch(products, searchKey);
        if (binaryIndex != -1) {
            System.out.println("Binary Search: Found at index " + binaryIndex);
            System.out.println(products[binaryIndex]);
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}