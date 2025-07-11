package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

public interface CountryService {
    Country findCountryByCode(String countryCode) throws CountryNotFoundException;
}

