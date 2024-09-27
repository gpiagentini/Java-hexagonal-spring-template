package br.com.gpiagentini.api.domain.service;

import br.com.gpiagentini.api.domain.model.Order;

public class OrderValidator {

    public static boolean validateOrder(Order order) {
        return order.isValidOrderDate();
    }

}
