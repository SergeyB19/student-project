package com.anton.saburov.studentorder;

import com.anton.saburov.domain.Address;
import com.anton.saburov.domain.Child;
import com.anton.saburov.domain.Person;
import com.anton.saburov.domain.other.Adult;
import com.anton.saburov.domain.StudentOrder;

import java.sql.*;
import java.time.LocalDate;

public class SaveStudentOrder {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jc_student",
                "postgres",
                "postgres"
        );
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM jc_street");
        while (rs.next()) {
            System.out.println(rs.getLong(1) + " : " + rs.getString(2));
        }


//        StudentOrder so = new StudentOrder();
//        buildStudentOrder(10);
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);


//        System.out.println("SaveStudentOrder is running");
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
        so.setMarriageCertificateId("" + (123456000 + id));
        so.setMarriageDate(LocalDate.of(2016, 7, 4));
        so.setMarriageOffice("Отдел ЗАГС");
        Address address = new Address("195000", "Заневский пр.", "12", "", "142");


        Adult husband = new Adult("Петров", "Виктор", "Сергеевич", LocalDate.of(1997, 8, 24));
        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (100_000 + id));
        husband.setIssueDate(LocalDate.of(2017, 9, 15));
        husband.setIssueDepartment("Отдел милиции №" + id);
        husband.setStudentId("" + (100_000 + id));
        husband.setAddress(address);

        Adult wife = new Adult("Петрова", "Вероника", "Алексеевна", LocalDate.of(1998, 3, 12));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (200_000 + id));
        wife.setIssueDate(LocalDate.of(2018, 4, 5));
        wife.setIssueDepartment("Отдел милиции №" + id);
        wife.setStudentId("" + (200_000 + id));
        wife.setAddress(address);

        Child child1 = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
        child1.setCertificateNumber("" + (300_000 + id));
        child1.setIssueDate(LocalDate.of(2018, 7, 19));
        child1.setIssueDepartment("Отдел ЗАГС №" + id);
        child1.setAddress(address);

        Child child2 = new Child("Петров", "Евгений", "Викторович", LocalDate.of(2018, 6, 29));
        child2.setCertificateNumber("" + (400_000 + id));
        child2.setIssueDate(LocalDate.of(2018, 7, 19));
        child2.setIssueDepartment("Отдел ЗАГС №" + id);
        child2.setAddress(address);

        so.setHusband(husband);
        so.setWife(wife);
        so.addChild(child1);
        so.addChild(child2);

        return so;
    }

    static void printStudentOrder(StudentOrder studentOrder) {
        System.out.println(studentOrder.getStudentOrderId());
    }
}
