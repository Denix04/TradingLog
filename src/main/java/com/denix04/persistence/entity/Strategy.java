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

    public Strategy() {
    }

    public Strategy(String strategy,String obs) {
        this.strategy = strategy;
        this.timeUsed = 0;
        this. ratioLostWin = 0;
        this.ratioLostProfit = 0;
        this.streak = 0;
        this.indicators = new ArrayList<>();
        this.observations = obs;

    }

}
