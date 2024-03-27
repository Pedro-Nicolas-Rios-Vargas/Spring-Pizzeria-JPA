package com.ordep.pizza.service.dto;

import lombok.Data;

@Data
public class UpdatePizzaPriceDTO {
    private int pizzaId;
    private double newPrice;
}
