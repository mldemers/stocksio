package com.hozlabs.stocks.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "history")
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class History {
    @Id
    @GeneratedValue
    private Long id;
    private String symbol;
    private double openPrice;
    private double closePrice;
    private LocalDate date;
}
