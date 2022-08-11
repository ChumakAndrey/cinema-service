package cinema.service;

import cinema.model.ShoppingCart;
import cinema.model.User;
import cinema.model.MovieSession;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
