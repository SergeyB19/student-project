package com.anton.saburov.studentorder;

import com.anton.saburov.domain.Person;
import com.anton.saburov.domain.other.Adult;
import com.anton.saburov.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        buildStudentOrder(10);
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

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        StudentOrder so1 = so;
        printStudentOrder(so1);
        Adult husband = new Adult("surName", "givenName", "patronymic", null);
        return so;
    }

    static void printStudentOrder(StudentOrder studentOrder) {
        System.out.println(studentOrder.getStudentOrderId());
    }
}
