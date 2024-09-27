package br.com.gpiagentini.api.domain.model;

import java.time.LocalDate;

public class Order {
    private Long id;
    private String description;
    private LocalDate orderDate;

    public Order(String description, LocalDate orderDate) {
        this.description = description;
        this.orderDate = orderDate;
    }

    public Order(Long id, String description, LocalDate orderDate) {
        this.description = description;
        this.orderDate = orderDate;
    }

    public boolean isValidOrderDate() {
        return orderDate.isBefore(LocalDate.now().plusDays(1));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

}
