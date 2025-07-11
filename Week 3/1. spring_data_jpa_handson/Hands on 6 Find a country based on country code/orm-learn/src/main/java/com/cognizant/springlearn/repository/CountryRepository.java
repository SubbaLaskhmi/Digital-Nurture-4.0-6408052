package com.cognizant.springlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.springlearn.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
