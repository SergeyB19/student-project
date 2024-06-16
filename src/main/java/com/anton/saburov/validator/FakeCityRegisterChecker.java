package com.anton.saburov.validator;

import com.anton.saburov.domain.CityRegisterCheckerResponse;
import com.anton.saburov.domain.Person;
import com.anton.saburov.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker {
    public CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException {
        return null;
    }
}
