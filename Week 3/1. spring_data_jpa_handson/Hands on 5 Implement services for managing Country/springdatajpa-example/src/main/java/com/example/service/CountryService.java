package com.example.service;

import com.example.entity.Country;
import com.example.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepo;

    public Country findByCode(String code) {
        return countryRepo.findById(code).orElse(null);
    }

    public Country addCountry(Country country) {
        return countryRepo.save(country);
    }

    public Country updateCountry(Country country) {
        return countryRepo.save(country); // same method for add/update
    }

    public void deleteCountry(String code) {
        countryRepo.deleteById(code);
    }

    public List<Country> searchByPartialName(String name) {
        return countryRepo.findByNameContainingIgnoreCase(name);
    }
}
