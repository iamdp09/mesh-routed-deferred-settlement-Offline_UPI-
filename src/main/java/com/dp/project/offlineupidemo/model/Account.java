package com.dp.project.offlineupidemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Account {

    @Id
    private String vpa; // virtual payment address like upi id

    @Column(nullable = false)
    private String holderName;

    @Column(nullable = false,precision = 19, scale = 2)
    private BigDecimal balance;

    @Version
    private Long version; // for optimistic locking concurrent updates/transfers

}

