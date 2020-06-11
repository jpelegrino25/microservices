package com.julioluis.currencyconversionservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CurrencyConversion {

    private Long id;
    private String from;
    protected String to;
    @JsonProperty("valueMultiply")
    private BigDecimal conversionMultiply;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int port;



    public CurrencyConversion(Long id, String from, String to,BigDecimal conversionMultiply, BigDecimal quantity, BigDecimal totalCalculatedAmount, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiply=conversionMultiply;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.port = port;
    }

    public CurrencyConversion() {
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

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public BigDecimal getConversionMultiply() {
        return conversionMultiply;
    }

    public void setConversionMultiply(BigDecimal conversionMultiply) {
        this.conversionMultiply = conversionMultiply;
    }
}
