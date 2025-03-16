package br.mateus.entity;

import java.time.OffsetDateTime;

public class Transaction {

    private Double value;
    private OffsetDateTime date;

    public Transaction(final Double value, OffsetDateTime date) {
        this.value = value;
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public OffsetDateTime getDate() {
        return date;
    }
}
