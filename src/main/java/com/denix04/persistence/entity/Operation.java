package com.denix04.persistence.entity;

import java.util.Date;
import com.denix04.persistence.entity.enums.*;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumeratedValue;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date openingDate;
    private Date closingDate;
    private double openingPrice;
    private double closingPrice;
    @Enumerated(EnumType.STRING)
    private Instrument instrument;
    private int cant;
    @Enumerated(EnumType.STRING)
    private TypeOperation type;
    private double commision;
    private double profit;
    private boolean win;
    @Enumerated(EnumType.STRING)
    private Trend trend;
    private double ratioRiskProfit;
    private String description;
}
