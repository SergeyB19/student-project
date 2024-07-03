package com.anton.saburov.validator.register;

import com.anton.saburov.domain.CityRegisterCheckerResponse;
import com.anton.saburov.domain.Person;
import com.anton.saburov.exception.CityRegisterException;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
