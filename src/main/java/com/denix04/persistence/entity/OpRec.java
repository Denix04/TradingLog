package com.denix04.persistence.entity;

import java.util.Date;
import com.denix04.persistence.entity.enums.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OpRec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date openingDate;
    private Date closingDate;
    private double openingPrice;
    private double closingPrice;
    private Instrument instrument;
    private int cant;
    private TypeOperation type;
    private double commision;
    private double profit;
    private boolean win;
}
