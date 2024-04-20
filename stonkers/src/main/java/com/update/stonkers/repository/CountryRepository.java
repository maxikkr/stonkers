package com.update.stonkers.repository;

import com.update.stonkers.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {
}
