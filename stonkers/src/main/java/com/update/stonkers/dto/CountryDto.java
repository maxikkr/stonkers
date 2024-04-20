package com.update.stonkers.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto {

    private Long id;
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
