package com.denix04.persistence.entity;

import com.denix04.persistence.entity.enums.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OperationStrategy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String strategy;
    private Trend trend;
    private double ratioRiskProfit;
    private String description;
}
