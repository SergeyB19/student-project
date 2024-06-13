package com.anton.saburov.validator;

import com.anton.saburov.domain.CityRegisterCheckerResponse;
import com.anton.saburov.domain.Person;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkPerson(Person person);
}
