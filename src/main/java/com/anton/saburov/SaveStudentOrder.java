package com.anton.saburov;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so;
        so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петрова";
        StudentOrder so1;
        so1 = new StudentOrder();
        so1.hFirstName = "Алексей";
        so1.hLastName = "Cидоров";
        so1.wFirstName = "Галина";
        so1.wLastName = "Сидорова";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
        long ans1 = saveStudentOrder(so1);
        System.out.println(ans1);
        byte a2;
        short a3 = 12000;
        int a1;
        long a4;
        a1 = (123 + 67) * 4 / 2 - 41;

        float d1;
        double d2;

        d2 = 145.8 - 67.9;

        char r = 'f';

        boolean b = false;
        boolean b1 = true;
        System.out.println("SaveStudentOrder is running");
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer;
        answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.hLastName);
        System.out.println("saveStudentOrder 1");
        System.out.println("saveStudentOrder 2");
        System.out.println("saveStudentOrder 3");
        return answer;
    }
}
