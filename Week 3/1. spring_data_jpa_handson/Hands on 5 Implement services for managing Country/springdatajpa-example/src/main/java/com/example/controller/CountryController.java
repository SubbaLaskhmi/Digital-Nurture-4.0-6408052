package com.example.controller;

import com.example.entity.Country;
import com.example.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return service.findByCode(code);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return service.addCountry(country);
    }

    @PutMapping
    public Country updateCountry(@RequestBody Country country) {
        return service.updateCountry(country);
    }

    @DeleteMapping("/{code}")
    public void deleteCountry(@PathVariable String code) {
        service.deleteCountry(code);
    }

    @GetMapping("/search")
    public List<Country> searchCountries(@RequestParam String name) {
        return service.searchByPartialName(name);
    }
}
