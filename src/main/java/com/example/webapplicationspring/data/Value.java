package com.example.webapplicationspring.data;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Value {

    @Column(name = "id")
    private BigInteger id;

    @Column(name = "kolumna1")
    private String firstColumn;

    @Column(name = "kolumna2")
    private String secondColumn;

    @Column(name = "kolumna3")
    private String thirdColumn;

    @Column(name = "kolumna4")
    private BigInteger fourthColumn;
}
