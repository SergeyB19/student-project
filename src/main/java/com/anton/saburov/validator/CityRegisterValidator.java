package com.anton.saburov.validator;

import com.anton.saburov.domain.AnswerCityRegister;
import com.anton.saburov.domain.CityRegisterCheckerResponse;
import com.anton.saburov.domain.Person;
import com.anton.saburov.domain.StudentOrder;
import com.anton.saburov.exception.CityRegisterException;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    public String login;
    public String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        try {
            CityRegisterCheckerResponse hans = personChecker.checkPerson(studentOrder.getHusband());
            CityRegisterCheckerResponse wans = personChecker.checkPerson(studentOrder.getWife());
            CityRegisterCheckerResponse cans = personChecker.checkPerson(studentOrder.getChild());
        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }


//        System.out.println("CityRegister is Running: " + hostName + "," + login + "," + password);
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        return answerCityRegister;
    }
}
