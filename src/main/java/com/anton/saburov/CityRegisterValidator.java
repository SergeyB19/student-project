package com.anton.saburov;

public class CityRegisterValidator {

    String hostName;
    String login;
    String password;

    AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("CityRegister is Running: " + hostName + "," + login + "," + password);
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        answerCityRegister.success = false;
        return answerCityRegister;
    }
}
