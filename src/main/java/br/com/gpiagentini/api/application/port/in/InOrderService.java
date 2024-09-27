package br.com.gpiagentini.api.application.port.in;

import br.com.gpiagentini.api.domain.model.Order;

public interface InOrderService {
    Order createOrder(String description);
}
