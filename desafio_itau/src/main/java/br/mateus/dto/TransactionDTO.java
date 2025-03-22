package br.mateus.dto;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;

public class TransactionDTO {

    @NotNull
    @Schema(description = "Valor da transação", example = "100.0", required = true)
    private Double value;

    @NotNull
    @Schema(description = "Data e hora da transação", example = "2023-03-22T14:30:00+00:00", required = true)
    private OffsetDateTime date;

    public Double getValue() {
        return value;
    }

    public OffsetDateTime getDate() {
        return date;
    }
}
