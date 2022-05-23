package tacos.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import tacos.Order;

public interface OrderRepository
         extends CrudRepository<Order, String> {

	Optional<Order> findById(Long id);
} 
