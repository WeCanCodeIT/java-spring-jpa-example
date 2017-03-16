package sales;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Can't call this 'Order': it's a reserved word in SQL. Hibernate isn't smart
 * enough.
 */
@Entity
public class CustomerOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Customer customer;

	private String orderNumber;

	private CustomerOrder() {
	}

	public CustomerOrder(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	@Override
	public String toString() {
		return "Order# " + orderNumber;
	}
}
