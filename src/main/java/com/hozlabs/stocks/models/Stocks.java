package com.hozlabs.stocks.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "stocks")
@EqualsAndHashCode(exclude = {"id"})
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Stocks {
    @Id
    @GeneratedValue
    private int id;

    private String symbol;

    private String name;

    private double price;
}
