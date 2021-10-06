package datasource.order;

import domain.order.OrderHistory;
import domain.order.OrderHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OrderHistoryRepositoryImpl implements OrderHistoryRepository {

    @Override
    public void save(OrderHistory orderHistory) {
    }
}
