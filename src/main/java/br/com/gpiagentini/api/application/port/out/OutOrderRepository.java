package br.com.gpiagentini.api.application.port.out;

import br.com.gpiagentini.api.domain.model.Order;

public interface OutOrderRepository {
    Order save(Order order);
}
