package com.revature.model;

//allows us to use code from the object class//
import java.util.Objects;
import java.io.Serializable;

/* this is a class with the attributes of a customer
these characteristics are instance variables which determine the state of the object
Serializable is an interface that will allow us to apply persistence (so that we can
store our data in a database)
storing data in a database will allow us to make our data available long-term. won't
to store it in an arraylist which can't hold data when the application isn't running
 */
public class User implements Serializable {
    int id;
    private String fName;
    private String lName;
    private String username;
    private String password;
   // roles include: customer, employee. how should these roles be incorporated to manifest their functions
    private Role roleCustomer = Role.CUSTOMER;
    private Role roleEmployee = Role.EMPLOYEE;

    public User(){

    }

    /* declaring a constructor method with instance variables from class customer as parameters
using bean design to make private instance variables accessible
this keyword refers to constructor parameter (local) variables, eliminating confusion between
class attributes and parameters with the same name
*/
    public User(String fName, String lName, String username, String password) {
        this.fName = fName;
        this.lName = lName;
        this.username = username;
        this.password = password;
    }

    /* public getter and setter methods allow us to use the private instance variables in other classes
     by calling each with it's assigned method name
     */

    public int getId() {
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRoleCustomer() {
        return roleCustomer;
    }

    public void setRoleCustomer(Role role) {
        this.roleCustomer = role;
    }
    @Override
    public boolean equals(Object o) {
        if (this == ) return true;
        if (o == null || getClass() != o.getClass());
        User user = (User) o;
        return id == user.id && Objects.equals(fName, user.fName) == Objects.equals(lName, user.lName) && Objects.equals(username, user.username) && Objects.equals(password, user.password) && role == user.role;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, fName, lName, username, password);
    }

    public String toString() {
        return "User{" +
                "id =" + id +
                ", firstName ='" + fName + '\'' +
                ", lastName ='" + lName + '\'' +
                ", username ='" + username + '\'' +
                ", password ='" + password + '\'' +
                ", role ='" + roleCustomer +
                '}';

    }
}