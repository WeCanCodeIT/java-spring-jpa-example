package sales;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Long> {
	Set<CustomerOrder> findAll();
}
