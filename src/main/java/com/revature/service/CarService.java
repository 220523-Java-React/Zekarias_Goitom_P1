package com.revature.service;

import com.revature.model.Car;
import com.revature.model.User;
import com.revature.repository.CarRepository;

import java.util.List;

public class CarService {

    static CarRepository carRepository;

    public CarService() {
        carRepository = new CarRepository();
    }

    public CarService(CarRepository carRepository) {
        CarService.carRepository = carRepository;
    }

    public static Car createNewCar(Car car) {
        return carRepository.create(car);
    }

    public List<Car> getAllCars() {
        return carRepository.getAll();
    }


    public Car getCarById(int id) {
        return carRepository.getById(id);
    }
}

   /* public List<Car> getAllCarsByMake(Make make){
        return carRepository.getAllByMake(make);
    }
    public Car getCarByID(int vin) {
        return carRepository.getCarByID(id);
    }
    public int something() {
        return 0;
    }
    public void printSomething() {
        System.out.println(something());
    }
}
    */
