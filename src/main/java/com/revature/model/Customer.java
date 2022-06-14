package com.revature.model;

import java.io.Serializable;

//allows us to use code from the object class//
import java.util.Objects;

/* this is a class with the attributes of a customer
these characteristics are instance variables which determine the state of the object
Serializable is an interface that will allow us to apply persistence (so that we can
store our data in a database)
storing data in a database will allow us to make our data available long-term. won't
to store it in an arraylist which can't hold data when the application isn't running
 */
public class Customer implements Serializable {
    private int idCustomer;
    private String fNameCustomer;
    private String lNameCustomer;
    private String usernameCustomer;
    private String passwordCustomer;

   //no args constructer//
    public Customer() {

    }

/* declaring a constructor method with instance variables from class customer as parameters
using bean design to make private instance variables accessible
this keyword refers to constructor parameter (local) variables, eliminating confusion between
class attributes and parameters with the same name
 */
    public Customer(String fNameCustomer, String lNameCustomer, String usernameCustomer, String passwordCustomer) {
        this.fNameCustomer = fNameCustomer;
        this.lNameCustomer = lNameCustomer;
        this.usernameCustomer = usernameCustomer;
        this.passwordCustomer = passwordCustomer;
    }

    /* public getter and setter methods allow us to use the private instance variables in other classes
     by calling each with it's assigned method name
     */
    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getFNameCustomer() {
        return fNameCustomer;
    }

    public void setFNameCustomer(String fName) {
        this.fNameCustomer = fNameCustomer;
    }

    public String getLNameCustomer() {
        return lNameCustomer;
    }

    public void setlNameCustomer(String lNameCustomer) {
        this.lNameCustomer = lNameCustomer;
    }

    public String getUsernameCustomer() {
        return usernameCustomer;
    }

    public void setUsernameCustomer(String usernameCustomer) {
        this.usernameCustomer = usernameCustomer;
    }

    public String getPasswordCustomer() {
        return passwordCustomer;
    }

    public void setPasswordCustomer(String passwordCustomer) {
        this.passwordCustomer = passwordCustomer;
    }





}
