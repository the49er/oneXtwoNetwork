package com.onetwonet.jpa.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "bets")
@ToString
public class Bet {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "numbets")
    private int numbets;

    @Column(name = "game")
    private String game;

    @Column(name = "stake")
    private BigDecimal stake;

    @Column(name = "returns")
    private BigDecimal returns;

    @Column(name = "client_id")
    private Long clientid;

    @Column(name = "date")
    private LocalDate date;

}
