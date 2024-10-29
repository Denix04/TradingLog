package com.denix04.persistence.entity;

import java.time.LocalDateTime;

import com.denix04.persistence.entity.enums.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime openingDate;
    @Column(nullable = true)
    private LocalDateTime closingDate;
    private double openingPrice;
    @Column(nullable = true)
    private Double closingPrice;
    @Enumerated(EnumType.STRING)
    private Instrument instrument;
    private int cant;
    @Enumerated(EnumType.STRING)
    private TypeOperation type;
    private double commision;
    private Double profit;
    @Enumerated(EnumType.STRING)
    private Trend trend;
    private double ratioRiskProfit;
    private String description;

    @ManyToOne
    @JoinColumn(name = "strategy_id")
    private Strategy strategy;

    public Operation() {
    }

    public Operation(double openingPrice, Instrument instrument, int cant, 
            TypeOperation type, double commision, Trend trend, 
            double ratioRiskProfit, String description, Strategy strategy) {
        this.openingDate = LocalDateTime.now();
        this.openingPrice = openingPrice;
        this.instrument = instrument;
        this.cant = cant;
        this.type = type;
        this.commision = commision;
        this.trend = trend;
        this.ratioRiskProfit = ratioRiskProfit;
        this.description = description;
        this.strategy = strategy;


        this.closingDate = null;
        this.closingPrice = null;
        this.profit = null;
    }
}
