package be.vdab.hateoas.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record NieuweConsole(@NotBlank String naam,
                            @NotNull @Positive BigDecimal gewicht) {
}