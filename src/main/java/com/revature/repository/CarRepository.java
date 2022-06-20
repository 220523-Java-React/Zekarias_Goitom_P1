package com.revature.repository;

import com.revature.model.Car;
import com.revature.util.ConnectionUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarRepository implements DAO<Car> {
    @Override
    public Car create(Car car) {
        String sql = "insert into car(make, model, color) values(?, ?, ?)";


        try (Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, car.getMake());
            stmt.setString(2, car.getModel());
            stmt.setString(3, car.getColor());

            int success = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return car;
    }

    @Override
    public List<Car> getAll() {
        // Empty lists of users, will add any new users from the result set
        List<Car> cars = new ArrayList<>();
        String sql = "select * from cars";

        try (Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet results = stmt.executeQuery();

            while (results.next()) {
                // go through each result, build a User object for that data, add that user object the users list
                Car car = new Car();


                car.setMake(results.getString("make"));
                car.setModel(results.getString("model"));
                car.setColor(results.getString("color"));
                car.setId(results.getInt("id"));

                cars.add(car);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cars;
    }

    @Override
    public Car getById(int id) {
        return null;
    }

    @Override
    public Car update(Car car) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
/*
    @Override
    public Car getByVin(int vin) {
        return null;
    }

    public List<Car> getAllByMake(Make make) {
    }

    public Car getCarById(int id) {
    }
}
*/