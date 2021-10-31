package com.github.IsaGoncalves.citiesapi.repository;

import com.github.IsaGoncalves.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
