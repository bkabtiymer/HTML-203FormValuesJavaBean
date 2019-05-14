package com.example.demo;

public class Employee{

    private String firstname;
    private String lastname;
    private int ssn;
    private int dobdate;
    private int dobmonth;
    private int dobyear;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getDobdate() {
        return dobdate;
    }

    public void setDobdate(int dobdate) {
        this.dobdate = dobdate;
    }

    public int getDobmonth() {
        return dobmonth;
    }

    public void setDobmonth(int dobmonth) {
        this.dobmonth = dobmonth;
    }

    public int getDobyear() {
        return dobyear;
    }

    public void setDobyear(int dobyear) {
        this.dobyear = dobyear;
    }
}
