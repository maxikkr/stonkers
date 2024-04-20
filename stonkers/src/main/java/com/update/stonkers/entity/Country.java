package com.update.stonkers.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "macro")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //ToDo: Not unique warum auch immer
    @Column(unique = true)
    private String country;
    private Double adj_default_spread;
    private Double equity_risk_premium;
    private Double country_risk_premium;
    private Double corporate_tax_rate;
    private String moodys_rating;
    private Double soverign_cds_spread;
    //private Double t_bills;
    private java.util.Date datetime;
}
