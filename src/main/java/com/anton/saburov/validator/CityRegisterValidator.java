package com.anton.saburov.validator;

import com.anton.saburov.domain.AnswerCityRegister;
import com.anton.saburov.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    public String login;
    public String password;

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("CityRegister is Running: " + hostName + "," + login + "," + password);
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        answerCityRegister.success = false;
        return answerCityRegister;
    }
}
