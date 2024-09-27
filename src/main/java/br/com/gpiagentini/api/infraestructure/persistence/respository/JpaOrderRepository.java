package br.com.gpiagentini.api.infraestructure.persistence.respository;

import br.com.gpiagentini.api.application.port.out.OutOrderRepository;
import br.com.gpiagentini.api.domain.model.Order;
import br.com.gpiagentini.api.infraestructure.persistence.mapper.OrderMapper;
import br.com.gpiagentini.api.infraestructure.persistence.entity.OrderDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class JpaOrderRepository implements OutOrderRepository {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order save(Order order) {
        var orderDataMapper = OrderMapper.toJpa(order);
        orderRepository.save(orderDataMapper);
        return OrderMapper.toDomain(orderDataMapper);
    }
}

interface OrderRepository extends JpaRepository<OrderDataMapper, Long> {}