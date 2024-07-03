package com.anton.saburov.domain;

import com.anton.saburov.domain.other.Adult;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentOrder {
    private long studentOrderId;
    private Adult husband;
    private Adult wife;
    private List<Child> children;
    private String marriageCertificateId;
    private String marriageOffice;
    private LocalDate marriageDate;

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

    public void addChild(Child child) {
        if (children == null) {
            children = new ArrayList<>(5);
        }
        children.add(child);
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public void setMarriageCertificateId(String s) {
    }

    public void setMarriageDate(LocalDate localDate) {
    }

    public void setMarriageOffice(String s) {

    }
}