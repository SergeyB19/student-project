package com.anton.saburov.studentorder;

import com.anton.saburov.domain.Person;
import com.anton.saburov.domain.other.Adult;
import com.anton.saburov.domain.StudentOrder;

public  class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        buildStudentOrder();
        long ans = saveStudentOrder(so);
        System.out.println(ans);


        System.out.println("SaveStudentOrder is running");
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer;
        answer = 199;
        System.out.println("saveStudentOrder: ");
        return answer;
    }

    public static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        Person p = new Person();

        System.out.println(husband.getSurName());
        husband.setGivenName("husbandName");
        husband.setSurName("husbandSurName");
        husband.setPassportNumber("123456");
        so.setHusband(husband);

        String ans = husband.getPersonString();
        System.out.println(ans);
        return so;
    }
}
