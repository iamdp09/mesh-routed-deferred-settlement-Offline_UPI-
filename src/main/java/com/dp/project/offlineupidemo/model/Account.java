package com.dp.project.offlineupidemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
@NoArgsConstructor
@Getter
@Setter
public class Account {

    @Id
    private String vpa; // virtual payment address like upi id

    @Column(nullable = false)
    private String holderName;

    @Column(nullable = false,precision = 19, scale = 2)
    private BigDecimal balance;

    @Version
    private Long version; // for optimistic locking concurrent updates/transfers

    public Account(String vpa, String holderName, BigDecimal balance) {
        this.vpa = vpa;
        this.holderName = holderName;
        this.balance = balance;
    }
}

