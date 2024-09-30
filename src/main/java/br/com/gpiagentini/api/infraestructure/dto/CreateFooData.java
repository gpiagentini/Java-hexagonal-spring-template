package br.com.gpiagentini.api.infraestructure.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateFooData(
        @NotBlank(message = "Description can't be blank") String description) {
}
