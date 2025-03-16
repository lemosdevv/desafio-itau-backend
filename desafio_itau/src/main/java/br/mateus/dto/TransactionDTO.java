package br.mateus.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class TransactionDTO {

    @NotNull
    @Min(0)
    private Double value;

    @NotNull
    private OffsetDateTime date;

    public Double getValue() {
        return value;
    }

    public OffsetDateTime getDate() {
        return date;
    }
}
