package com.aziz.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User customer;

    @OneToOne
    private Order order;

    @ManyToOne
    private Seller seller;

    //when transaction is created
    private LocalDateTime date = LocalDateTime.now();
}
