package sales;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;

	// mappedBy: because in the database, things point the other direction
	// mappedBy "customer" is referring to CustomerOrder.customer
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
	private Collection<CustomerOrder> orders;

	/**
	 * Spring Data/JPA requires a no-argument constructor.
	 */
	protected Customer() {
	}

	/**
	 * Overloading constructor to allow creation of a Customer without any
	 * orders.
	 */
	public Customer(String firstName, String lastName) {
		this(firstName, lastName, Collections.emptyList());
	}

	public Customer(String firstName, String lastName, Collection<CustomerOrder> orders) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.orders = orders;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s', orders: %s]", id, firstName, lastName,
				orders);
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Collection<CustomerOrder> getOrders() {
		return orders;
	}

}
