package DependencyInjection;

public class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String customerId) 
    {
        return "Customer[ID=" + customerId + ", Name=Alice Smith]";
    }
}