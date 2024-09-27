package br.com.gpiagentini.api.infraestructure.configuration.web;

import br.com.gpiagentini.api.application.port.in.InOrderService;
import br.com.gpiagentini.api.application.port.out.OutOrderRepository;
import br.com.gpiagentini.api.application.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public OrderServiceImpl orderService(OutOrderRepository orderRepository) {
        return new OrderServiceImpl(orderRepository);
    }

}