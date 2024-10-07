package com.anton.saburov.validator;

import com.anton.saburov.domain.AnswerChildren;
import com.anton.saburov.domain.wedding.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder studentOrder) {
        System.out.println("Children  Check is running");
        return new AnswerChildren();
    }
}
