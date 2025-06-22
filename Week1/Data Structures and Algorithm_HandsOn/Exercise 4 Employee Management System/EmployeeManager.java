package EmployeeManagementSystem;

public class EmployeeManager {
	
	public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);
        manager.add(new Employee("E001", "Alice", "Manager", 75000));
        manager.add(new Employee("E002", "Bob", "Developer", 60000));
        manager.add(new Employee("E003", "Charlie", "Tester", 50000));

        System.out.println("All Employees:");
        manager.traverse();
        System.out.println("\nSearching for E002:");
        Employee found = manager.search("E002");
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Employee not found.");
        }
        System.out.println("\nDeleting E002:");
        manager.delete("E002");
        System.out.println("\nEmployees after deletion:");
        manager.traverse();
    }

	private Employee[] employees;
    private int size = 0;
    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
    }
    public void add(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
        } else {
            System.out.println("Cannot add more employees. Capacity full.");
        }
    }
    public Employee search(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }
    public void delete(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("Employee with ID " + id + " deleted.");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void traverse() {
        if (size == 0) {
            System.out.println("No employees to display.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i]);
            }
        }
    }
    
}
