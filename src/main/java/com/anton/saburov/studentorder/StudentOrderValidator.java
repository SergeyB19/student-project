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
        StudentOrder[] studentOrderArray = readStudentOrders();
        for (int c = 0; c < studentOrderArray.length; c++) {
            System.out.println();
            checkOneOrder(studentOrderArray[c]);
        }

      /*  for (StudentOrder studentOrder : studentOrderArray) {
            System.out.println();
            checkOneOrder(studentOrder);
        }*/

    }

    public StudentOrder[] readStudentOrders() {
        StudentOrder[] studentOrdersArray = new StudentOrder[5];
        for (int c = 0; c < studentOrdersArray.length; c++) {
            studentOrdersArray[c] = SaveStudentOrder.buildStudentOrder(c);
        }
        /*StudentOrder studentOrder = new StudentOrder();
        return studentOrder;*/
        return studentOrdersArray;
    }

    public void checkOneOrder(StudentOrder studentOrder) {
        AnswerCityRegister cityAnswer = checkCityRegister(studentOrder);
        AnswerWedding answerWedding = checkWedding(studentOrder);
        AnswerChildren answerChildren = checkChildren(studentOrder);
        AnswerStudent answerStudent = checkStudent(studentOrder);
        sendMail(studentOrder);
    }


    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
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
