package com.denix04.persistence.entity;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Strategy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String strategy;
    private int timeUsed;
    private double ratioLostWin;
    private double ratioLostProfit;
    private int streak;
    private ArrayList<TradingIndicator> indicators;
    private String observations;

}
