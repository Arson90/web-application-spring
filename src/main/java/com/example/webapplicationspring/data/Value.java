package com.example.webapplicationspring.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "value")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Value {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "value_id")
    private int id;
    private String firstColumn;
    private String secondColumn;
    private String thirdColumn;
    private BigInteger fourthColumn;
}
