package com.anton.saburov.validator;

import com.anton.saburov.domain.CityRegisterCheckerResponse;
import com.anton.saburov.domain.Person;

public class FakeCityRegisterChecker implements CityRegisterChecker {
    public CityRegisterCheckerResponse checkPerson(Person person) {
        return null;
    }
}
