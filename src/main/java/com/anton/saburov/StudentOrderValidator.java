package com.anton.saburov;

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

    private static void sendMail(StudentOrder studentOrder) {
        System.out.println("Почта отправлена");
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
        System.out.println("Wedding is start");
        AnswerWedding answerWedding = new AnswerWedding();
        return answerWedding;
    }

    static AnswerChildren checkChildren(StudentOrder studentOrder) {
        System.out.println("Children  Check is running");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder studentOrder) {
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }
}
