package com.update.stonkers.controller;


import com.update.stonkers.dto.CountryDto;
import com.update.stonkers.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/countries")
public class CountryController {

    private CountryService countryService;

    // Build Add Country Employee REST Api

    //Brauche diesen Endpoint nicht
    //ToDo: ändern zu Web scraper
    @PostMapping
    public ResponseEntity<CountryDto> createCountry(@RequestBody CountryDto countryDto){
        CountryDto savedCountry= countryService.createCountry(countryDto);
        return new ResponseEntity<>(savedCountry, HttpStatus.CREATED);
    };

}
