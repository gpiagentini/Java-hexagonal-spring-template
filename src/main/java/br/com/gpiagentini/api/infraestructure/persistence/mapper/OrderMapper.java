package br.com.gpiagentini.api.infraestructure.persistence.mapper;

import br.com.gpiagentini.api.domain.model.Order;
import br.com.gpiagentini.api.infraestructure.persistence.entity.OrderDataMapper;

public class OrderMapper {

    // Converts JPA entity to domain entity
    public static Order toDomain(OrderDataMapper orderDataMapper) {
        return new Order(orderDataMapper.getId(), orderDataMapper.getDescription(), orderDataMapper.getOrderDate());
    }

    // Converts domain entity to JPA entity
    public static OrderDataMapper toJpa(Order order) {
        OrderDataMapper orderDataMapper = new OrderDataMapper();
        orderDataMapper.setId(order.getId());
        orderDataMapper.setDescription(order.getDescription());
        orderDataMapper.setOrderDate(order.getOrderDate());
        return orderDataMapper;
    }
}
