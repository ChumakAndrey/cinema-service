package cinema.service;

import cinema.model.Order;
import cinema.model.ShoppingCart;
import java.util.List;
import cinema.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
