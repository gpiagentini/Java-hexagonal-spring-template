package br.com.gpiagentini.api.infraestructure.adapters.controllers;


import br.com.gpiagentini.api.application.port.in.InOrderService;
import br.com.gpiagentini.api.domain.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final InOrderService orderService;

    public OrderController(InOrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestParam String description) {
        Order order = orderService.createOrder(description);
        return ResponseEntity.ok(order);
    }

    @GetMapping
    public String get() {
        return "SALVE";
    }
}
