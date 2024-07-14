package com.anton.saburov.validator;

import com.anton.saburov.domain.*;
import com.anton.saburov.exception.CityRegisterException;
import com.anton.saburov.validator.register.AnswerCityRegisterItem;
import com.anton.saburov.validator.register.CityRegisterChecker;
import com.anton.saburov.validator.register.FakeCityRegisterChecker;

import java.util.List;

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
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();

        answerCityRegister.addItem(checkPerson(studentOrder.getHusband()));
        answerCityRegister.addItem(checkPerson(studentOrder.getWife()));
        for (Child child : studentOrder.getChildren()) {
            answerCityRegister.addItem(checkPerson(child));
        }
        return answerCityRegister;
    }


    private AnswerCityRegisterItem checkPerson(Person person) {

        try {
            CityRegisterResponse cans = personChecker.checkPerson(person);

        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
}
