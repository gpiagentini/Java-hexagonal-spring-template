package br.com.gpiagentini.api.application.service;

import br.com.gpiagentini.api.application.port.in.InOrderService;
import br.com.gpiagentini.api.application.port.out.OutOrderRepository;
import br.com.gpiagentini.api.domain.model.Order;
import br.com.gpiagentini.api.domain.service.OrderValidator;

import java.time.LocalDate;

public class OrderServiceImpl implements InOrderService {

    private final OutOrderRepository outOrderRepository;

    public OrderServiceImpl(OutOrderRepository outOrderRepository) {
        this.outOrderRepository = outOrderRepository;
    }

    @Override
    public Order createOrder(String description) {
        Order order = new Order(description, LocalDate.now());

        if (OrderValidator.validateOrder(order)) {
            return outOrderRepository.save(order);
        } else {
            throw new IllegalArgumentException("Invalid order date.");
        }
    }

}
