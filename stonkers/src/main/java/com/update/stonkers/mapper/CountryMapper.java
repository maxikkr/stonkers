package com.update.stonkers.mapper;

import com.update.stonkers.dto.CountryDto;
import com.update.stonkers.entity.Country;

public class CountryMapper {
    public static CountryDto mapToCountryDto(Country country) {
        return new CountryDto(
                country.getId(),
                country.getCountry(),
                country.getAdj_default_spread(),
                country.getEquity_risk_premium(),
                country.getCountry_risk_premium(),
                country.getCorporate_tax_rate(),
                country.getMoodys_rating(),
                country.getSoverign_cds_spread(),
                country.getDatetime()

        );
    }

    public static Country maptoCountry(CountryDto countryDto) {
      return new Country(
              countryDto.getId(),
              countryDto.getCountry(),
              countryDto.getAdj_default_spread(),
              countryDto.getEquity_risk_premium(),
              countryDto.getCountry_risk_premium(),
              countryDto.getCorporate_tax_rate(),
              countryDto.getMoodys_rating(),
              countryDto.getSoverign_cds_spread(),
              countryDto.getDatetime()
      );
    }
}
