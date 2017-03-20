package sales;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@Resource
	private CustomerRepository repo;
	
	@RequestMapping("/customers")
	public String showCustomers(Model model) {
		Iterable<Customer> allCustomers = repo.findAll();
		model.addAttribute("customersAttribute", allCustomers);
		return "all-customers-view";
	}
}
