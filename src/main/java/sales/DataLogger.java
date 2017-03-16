package sales;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLogger implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(DataLogger.class);
	
	//often done like this:
	// private Logger log = LoggerFactory.getLogger(getClass());
	
	private CustomerRepository customerRepo;

	private CustomerOrderRepository orderRepo;
	
	public DataLogger(CustomerRepository customerRepo, CustomerOrderRepository orderRepo) {
		this.customerRepo = customerRepo;
		this.orderRepo = orderRepo;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Iterable<Customer> customers = customerRepo.findAll();
		log.info("Customers:");
		for(Customer customer: customers) {
			log.info(customer.toString());
		}
		
		Set<CustomerOrder> orders = orderRepo.findAll();
		log.info("Orders:");
		for(CustomerOrder order: orders) {
			String msg = String.format("%s for customer %s", order, order.getCustomer());
			log.info(msg);
		}
	}

}
