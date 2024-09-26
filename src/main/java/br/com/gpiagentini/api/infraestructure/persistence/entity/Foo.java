package br.com.gpiagentini.api.infraestructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name="Foo")
@Entity
@Getter
@Setter
public class Foo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
