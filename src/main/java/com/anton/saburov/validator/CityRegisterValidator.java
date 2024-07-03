package com.anton.saburov.validator;

import com.anton.saburov.domain.AnswerCityRegister;
import com.anton.saburov.domain.Child;
import com.anton.saburov.domain.CityRegisterCheckerResponse;
import com.anton.saburov.domain.StudentOrder;
import com.anton.saburov.exception.CityRegisterException;
import com.anton.saburov.validator.register.CityRegisterChecker;
import com.anton.saburov.validator.register.FakeCityRegisterChecker;

import java.util.Iterator;
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
        try {
            CityRegisterCheckerResponse hans = personChecker.checkPerson(studentOrder.getHusband());
            CityRegisterCheckerResponse wans = personChecker.checkPerson(studentOrder.getWife());

            List<Child> children = studentOrder.getChildren();
            for (int i = 0; i < studentOrder.getChildren().size(); i++) {
                CityRegisterCheckerResponse cans = personChecker.checkPerson(studentOrder.getChildren().get(i));
            }

            for (Iterator<Child> it = children.iterator(); it.hasNext(); ) {
                Child child = it.next();
                CityRegisterCheckerResponse cans = personChecker.checkPerson(child);
            }

            for (Child child : children) {
                CityRegisterCheckerResponse cans = personChecker.checkPerson(child);
            }

        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }


//        System.out.println("CityRegister is Running: " + hostName + "," + login + "," + password);
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        return answerCityRegister;
    }
}
