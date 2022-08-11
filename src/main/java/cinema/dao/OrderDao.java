package cinema.dao;

import cinema.model.Order;
import java.util.List;
import cinema.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
