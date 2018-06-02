package com.hozlabs.stocks.models;

import lombok.*;

import javax.persistence.*;

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

    @OneToMany(
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    @OrderColumn
    private History[] histories;
}
