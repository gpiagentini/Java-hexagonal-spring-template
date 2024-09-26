package br.com.gpiagentini.api.infraestructure.persistence.respository;

import br.com.gpiagentini.api.infraestructure.persistence.entity.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FooRepository extends JpaRepository<Foo, Long> {
}
