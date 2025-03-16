package br.mateus.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Transaction {

    private BigDecimal value;
    private OffsetDateTime date;

    public Transaction(final BigDecimal value, OffsetDateTime date) {
        this.value = value;
        this.date = date;
    }

    public BigDecimal getValue() {
        return value;
    }

    public OffsetDateTime getDate() {
        return date;
    }
}
