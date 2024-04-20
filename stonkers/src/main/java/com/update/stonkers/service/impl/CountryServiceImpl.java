package com.update.stonkers.service.impl;

import com.update.stonkers.dto.CountryDto;
import com.update.stonkers.entity.Country;
import com.update.stonkers.mapper.CountryMapper;
import com.update.stonkers.repository.CountryRepository;
import com.update.stonkers.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;


    @Override
    public CountryDto createCountry(CountryDto countryDto) {

        Country country = CountryMapper.maptoCountry(countryDto);
        Country savedCountry = countryRepository.save(country);
        return CountryMapper.mapToCountryDto(savedCountry);
    }
}
