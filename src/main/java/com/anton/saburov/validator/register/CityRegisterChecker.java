package com.anton.saburov.validator.register;

import com.anton.saburov.domain.CityRegisterResponse;
import com.anton.saburov.domain.Person;
import com.anton.saburov.exception.CityRegisterException;

public interface CityRegisterChecker {
    CityRegisterResponse checkPerson(Person person) throws CityRegisterException;
}
