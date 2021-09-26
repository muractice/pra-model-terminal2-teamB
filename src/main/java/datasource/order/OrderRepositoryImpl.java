package datasource.order;

import domain.order.OrderHistory;
import domain.order.OrderRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public void save(OrderHistory orderHistory) {
    }
}
