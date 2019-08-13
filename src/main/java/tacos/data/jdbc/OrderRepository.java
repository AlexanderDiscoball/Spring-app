package tacos.data.jdbc;

import tacos.Order;

public interface OrderRepository {
    Order save(Order order);
}
