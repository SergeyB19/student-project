package com.anton.saburov.studentorder;

import com.anton.saburov.domain.*;
import com.anton.saburov.mail.MailSender;
import com.anton.saburov.validator.ChildrenValidator;
import com.anton.saburov.validator.CityRegisterValidator;
import com.anton.saburov.validator.StudentValidator;
import com.anton.saburov.validator.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterValidator;
    private WeddingValidator weddingValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private MailSender mailSender;


    public StudentOrderValidator() {
        cityRegisterValidator = new CityRegisterValidator();
        weddingValidator = new WeddingValidator();
        childrenValidator = new ChildrenValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
    }


    public static void main(String[] args) {
        StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
        studentOrderValidator.checkAll();
    }

    public void checkAll() {

        while (true) {
            StudentOrder studentOrder = readStudentOrder();
//            System.out.println("Start");

            if (studentOrder == null) {
                break;
            }
//            System.out.println("Finish");
            AnswerCityRegister cityAnswer = checkCityRegister(studentOrder);
            if (!cityAnswer.success) {
//                continue;
                break;
            }
            AnswerWedding answerWedding = checkWedding(studentOrder);
            AnswerChildren answerChildren = checkChildren(studentOrder);
            AnswerStudent answerStudent = checkStudent(studentOrder);

            sendMail(studentOrder);
        }
//        System.out.println("Finish 2");

    }


    public StudentOrder readStudentOrder() {
        SaveStudentOrder.buildStudentOrder();
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        /*CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        crv1.login = "login1";
        crv1.password = "password1";
        CityRegisterValidator crv2 = new CityRegisterValidator();
        crv2.hostName = "Host2";
        crv2.login = "login2";
        crv2.password = "password2";
        AnswerCityRegister ans1 = crv1.checkCityRegister(studentOrder);
        AnswerCityRegister ans2 = crv2.checkCityRegister(studentOrder);*/
        return cityRegisterValidator.checkCityRegister(studentOrder);
    }

    public AnswerWedding checkWedding(StudentOrder studentOrder) {
        return weddingValidator.checkWedding(studentOrder);
    }

    public AnswerChildren checkChildren(StudentOrder studentOrder) {
        return childrenValidator.checkChildren(studentOrder);
    }

    public AnswerStudent checkStudent(StudentOrder studentOrder) {
        return studentValidator.checkStudent(studentOrder);
    }

    public void sendMail(StudentOrder studentOrder) {
        mailSender.sendMail(studentOrder);
    }
}
