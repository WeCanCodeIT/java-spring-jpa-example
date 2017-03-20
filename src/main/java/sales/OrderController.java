package sales;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {

	@Resource
	private OrderRepository repo;

	@RequestMapping("/order")
	public String showOrder(@RequestParam long id, Model model) {
		CustomerOrder order = repo.findOne(id);
		// will generate the name 'customerOrder' for the attribute since its
		// class is CustomerOrder
		model.addAttribute(order);
		return "order-details-view";
	}
}
