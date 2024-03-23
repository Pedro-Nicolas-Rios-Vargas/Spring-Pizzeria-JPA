package com.ordep.pizza.persistence.repository;

import com.ordep.pizza.persistence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository
        extends ListCrudRepository<PizzaEntity, Integer> {
}
