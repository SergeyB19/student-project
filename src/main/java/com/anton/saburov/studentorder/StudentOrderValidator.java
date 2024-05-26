package com.anton.saburov.studentorder;
import com.anton.saburov.domain.*;
import com.anton.saburov.mail.MailSender;
import com.anton.saburov.validator.ChildrenValidator;
import com.anton.saburov.validator.CityRegisterValidator;
import com.anton.saburov.validator.StudentValidator;
import com.anton.saburov.validator.WeddingValidator;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {

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



    static StudentOrder readStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        crv1.login = "login1";
        crv1.password = "password1";
        CityRegisterValidator crv2 = new CityRegisterValidator();
        crv2.hostName = "Host2";
        crv2.login = "login2";
        crv2.password = "password2";
        AnswerCityRegister ans1 = crv1.checkCityRegister(studentOrder);
        AnswerCityRegister ans2 = crv2.checkCityRegister(studentOrder);
        return ans1;
    }

    static AnswerWedding checkWedding(StudentOrder studentOrder) {
        WeddingValidator weddingValidator = new WeddingValidator();
        return weddingValidator.checkWedding(studentOrder);
    }

    static AnswerChildren checkChildren(StudentOrder studentOrder) {
        ChildrenValidator childrenValidator = new ChildrenValidator();
        return childrenValidator.checkChildren(studentOrder);
    }

    static AnswerStudent checkStudent(StudentOrder studentOrder) {
        StudentValidator studentValidator = new StudentValidator();
        return studentValidator.checkStudent(studentOrder);
    }

    private static void sendMail(StudentOrder studentOrder) {
        new MailSender().sendMail(studentOrder);
    }
}
