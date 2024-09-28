package br.com.gpiagentini.api.infraestructure.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Foo")
public class FooDataMapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

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
}
