package com.revature.repository;

import com.revature.model.Car;

import com.revature.model.Role;
import com.revature.model.User;
import com.revature.util.ConnectionUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarRepository implements DAO<Car> {

    @Override
    public Car create(Car car) {
        // we are receiving a full car object
        // we need a query to insert that record
        //
        String sql = "insert into cars(make, model, color, id) values(?,?,?,?)";

        /*
                This is a Try-With-Resources block
                used when you have resources that have open channels that you need to eventually close

                try with resource WILL automatically close anything that implements the AutoClosable interface
         */
        try(Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement stmt = connection.prepareStatement(sql); // Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, car.getMake());
            stmt.setString(2, car.getModel());
            stmt.setString(3, car.getColor());
            stmt.setInt(4, car.getId());

            int success = stmt.executeUpdate();
           /* ResultSet keys = stmt.getGeneratedKeys();
            if(keys.next()) {
                int id = keys.getInt(1);
                return car.setId(id);
            }*/
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public List<Car> getAll(){
        // Empty lists of users, will add any new users from the result set
        List<Car> cars = new ArrayList<>();
        String sql = "select * from users order by id";

        try(Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet results = stmt.executeQuery();

            while(results.next()){
                // go through each result, build a User object for that data, add that user object the users list
                cars.add(new Car()
                        .setMake(results.getString("make"))
                        .setModel(results.getString("model"))
                        .setColor(results.getString("color"))
                        .setId(results.getInt("id"))

                );
            }


        }catch(SQLException e){
            e.printStackTrace();
        }

        return cars;
    }

    @Override
    public Car getById(int id){

        String sql = "select * from cars where id = ?";
        try(Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                // build return the user and return it
                return new Car()
                        .setId(rs.getInt("id"))
                        .setMake(rs.getString("make"))
                        .setModel(rs.getString("model"))
                        .setColor(rs.getString("color"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
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