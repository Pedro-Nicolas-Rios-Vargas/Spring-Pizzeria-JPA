package com.ordep.pizza.persistence.repository;

import com.ordep.pizza.persistence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PizzaRepository
        extends ListCrudRepository<PizzaEntity, Integer> {
    List<PizzaEntity> findAllByAvailableTrueOrderByPrice();

    PizzaEntity findByAvailableTrueAndNameIgnoreCase(String name);
}
