package com.anton.saburov;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {

        while (true) {
            StudentOrder studentOrder = readStudentOrder();
            System.out.println("Start");

            if (studentOrder == null) {
                break;
            }
            System.out.println("Finish");
            AnswerCityRegister cityAnswer = checkCityRegister(studentOrder);
            if (!cityAnswer.success) {
                continue;
            }
            AnswerWedding answerWedding = checkWedding(studentOrder);
            AnswerChildren answerChildren = checkChildren(studentOrder);
            AnswerStudent answerStudent = checkStudent(studentOrder);

            sendMail(studentOrder);
        }
        System.out.println("Finish 2");

    }

    private static void sendMail(StudentOrder studentOrder) {
        System.out.println("Почта отправлена");
    }

    static StudentOrder readStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();
        return null;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("CityRegister is Running");
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        answerCityRegister.success = false;
        return answerCityRegister;
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
