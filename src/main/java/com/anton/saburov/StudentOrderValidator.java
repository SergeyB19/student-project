package com.anton.saburov;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder studentOrder = readStudentOrder();

        AnswerCityRegister cityAnswer = checkCityRegister(studentOrder);
        AnswerWedding answerWedding = checkWedding(studentOrder);
        AnswerChildren answerChildren = checkChildren(studentOrder);
        AnswerStudent answerStudent = checkStudent(studentOrder);

        sendMail(studentOrder);
    }

    private static void sendMail(StudentOrder studentOrder) {

    }

    static StudentOrder readStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("CityRegister is Running");
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
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
