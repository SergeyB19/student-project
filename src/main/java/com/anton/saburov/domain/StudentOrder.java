package com.anton.saburov.domain;

import com.anton.saburov.domain.other.Adult;

import java.time.LocalDate;

public class StudentOrder {
    private long studentOrderId;
    private Adult husband;
    private Adult wife;
    private Child child;

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public void setMarriageCertificateId(String s) {
    }

    public void setMarriageDate(LocalDate localDate) {
    }

    public void setMarriageOffice(String s) {

    }
}