package com.revature.model;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
    private int idEmployee;
    private String fNameEmployee;
    private String lNameEmployee;
    private String usernameEmployee;
    private String passwordEmployee;

    //no args constructor//
    public Employee() {

    }

    /*constructor with args will give other classes access to private instance variables
    using bean design with public getter and setter methods*/
    public Employee(String fNameEmployee, String lNameEmployee, String usernameEmployee, String passwordEmployee) {
        this.fNameEmployee = fNameEmployee;
        this.lNameEmployee = lNameEmployee;
        this.usernameEmployee = usernameEmployee;
        this.passwordEmployee = passwordEmployee;
    }

    public String getFNameEmployee(){
        return fNameEmployee;
    }

    public void setFNameEmployee(String fNameEmployee) {
        this.fNameEmployee = fNameEmployee;

    }
    public String getLNameEmployee(){
        return lNameEmployee;
    }
    public void setLNameEmployee(String lNameEmployee){
        this.lNameEmployee = lNameEmployee;
    }
    public String getUsernameEmployee(){
        return usernameEmployee;
    }
    public void setUsernameEmployee(String usernameEmployee){
        this.usernameEmployee = usernameEmployee;
    }
    public String getPasswordEmployee(){
        return passwordEmployee;
    }
    public void setPasswordEmployee(String passwordEmployee) {
        this.passwordEmployee = passwordEmployee;
    }
}


