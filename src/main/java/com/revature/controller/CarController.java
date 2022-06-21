package com.revature.controller;

import com.revature.model.Car;
import com.revature.model.User;
import com.revature.service.CarService;
import io.javalin.http.Handler;
import org.eclipse.jetty.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;


/* car controller will give us the leverage to use our business logic which is held in our service package (CarService class
in this case)
This is where our handlers will be placed.
think of this as kinda like a receptionist between the caller (GET,POST, etc.) located in our Driver and the business logic located in the Services
the handler is the 2nd parameter in each CRUD method
 */

public class CarController {

    //initializing a carservice object of clas CarService. we can use this object to retrieve states and behaviors from within the CarService class
    CarService carService = new CarService();

    // handler is a functional interface with a method that handles. context is a parameter in the handles method
    public Handler getAllCars = context-> {
        context.json(carService.getAllCars());
        };
    public Handler setCar = context-> {
        Car car = context.bodyAsClass(Car.class);
        CarService.createNewCar(car);

    };
    public Handler getCarById = context -> {
        String param = context.pathParam("id");

        try{
            // hopefully is not null
            Car car = carService.getCarById(
                    Integer.parseInt(param)
            );
            if(car != null){
                // valid user, return it
                context.json(car);
            } else {
                // couldn't find the user, return a 404
                context.result("Car not found").status(404);
            }
        } catch(NumberFormatException e){
            context.result("Please submit an integer as an id");
            context.status(400);
        }
    };




}
