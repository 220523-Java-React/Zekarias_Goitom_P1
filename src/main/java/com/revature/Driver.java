package com.revature;

//revature packages
import com.revature.controller.CarController;
import com.revature.controller.UserController;
import com.revature.model.User;
import com.revature.model.Car;

//revature package for Database connection
import com.revature.util.ConnectionUtility;

//Gradle dependency libraries
import io.javalin.Javalin;
import io.javalin.http.HandlerType;
import org.eclipse.jetty.http.HttpMethod;

//java based libraries
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


/* the driver class will be the engine of the app/web server
it's from here that we will be running the app/web server
it's where the main method is located
 */
public class Driver {

    //the entry point of our class begins at the main method. it's the engine for this whole app
    public static void main(String[] args) {


        //creates an instance of the UserController class. This will allow us to access it behaviors and states here in this class
        UserController userController = new UserController();


        //initializes an object named carcontroller which will be an instance of the CarController class
        CarController carController = new CarController();
    //.create() is a method that acts as a constructor to initialize the app object of the Javalin class//
        Javalin app = Javalin.create();
        //start is a Javalin method that starts the app, which is basically the web server (I think)
        //inside start you put the port you want your webserver to be listening on. is start a CRUD operation? I think so
        //do not write the word port. just write the port number and the word port will automatically appear after
        app.start(8080);

        //get is a method of Javalin. Also, a very familiar CRUD operation
        //the first parameter of the get method is for the endpoint on your app that you want it pointing to when it "get" data
        //the 2nd parameter is for the data that you want it to retrieve
        //in the first parameter we use a / to indicate here (within the driver module). this is our base URl
        //soon we will add more binding via endpoint using '/' followed by the endpoint's name
        //in the 2nd parameter we use the context method to print out a string which is the data get will retrieve
        //context is a lambda function(method) which allows us to create in-line implementation of an interface
        app.get("/", context-> context.result("Welcome to Java's Dealership"));
        app.get("/cars", carController.getAllCars);
        app.get("/cars/{id}", carController.getCarById);
        app.post("/cars", carController.setCar);


        app.get("/users", userController.getAllUsers);
        app.get("/users/{id}", userController.getUserById);
        app.post("/users", userController.createUser);

        app.get("/offers, offerController.getAllOffers");




    }
}

