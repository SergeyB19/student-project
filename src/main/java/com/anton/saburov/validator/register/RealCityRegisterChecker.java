package com.anton.saburov.validator.register;

import com.anton.saburov.domain.CityRegisterResponse;
import com.anton.saburov.domain.Person;
import com.anton.saburov.exception.CityRegisterException;
import com.anton.saburov.exception.TransportException;

public class RealCityRegisterChecker implements CityRegisterChecker {
    public CityRegisterResponse checkPerson(Person person) throws CityRegisterException, TransportException {

        return null;
    }
}
