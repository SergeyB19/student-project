package com.anton.saburov.validator;

import com.anton.saburov.domain.AnswerStudent;
import com.anton.saburov.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder studentOrder) {
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }
}
