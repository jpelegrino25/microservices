package com.julioluis.currencyexchangeservice.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class ExchangeValue {

    @Id
    private Long id;
    @Column(name = "currency_from")
    private String from;
    @Column(name = "currency_to")
    private String to;
    @Column(name = "value_multiply")
    private BigDecimal valueMultiply;
    @Transient
    private int port;

    public ExchangeValue(Long id, String from, String to, BigDecimal valueMultiply) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.valueMultiply = valueMultiply;
    }

    public ExchangeValue() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getValueMultiply() {
        return valueMultiply;
    }

    public void setValueMultiply(BigDecimal valueMultiply) {
        this.valueMultiply = valueMultiply;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
