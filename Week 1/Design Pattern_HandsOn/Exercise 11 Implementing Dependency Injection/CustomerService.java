package DependencyInjection;

public class CustomerService {
	private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) 
    {
        this.customerRepository = customerRepository;
    }
    public void getCustomerDetails(String customerId) 
    {
        String customer = customerRepository.findCustomerById(customerId);
        System.out.println("Fetched: " + customer);
    }
}