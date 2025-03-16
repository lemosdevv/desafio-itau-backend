package br.mateus.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class TransactionDTO {

    @NotNull
    @Min(0)
    private BigDecimal value;

    @NotNull
    private OffsetDateTime date;

    public BigDecimal getValue() {
        return value;
    }

    public OffsetDateTime getDate() {
        return date;
    }
}
