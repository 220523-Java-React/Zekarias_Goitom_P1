package com.revature.repository;

import java.util.List;

// T is a generic class data type
public interface DAO <T> {
   //these are the methods and variables of this interface. They will be guidelines of how to use these states and
    //behaviors to the classes that implement this interface
    T create(T t);

    List<T> getAll();

    T getById(int id);

    T update(T t);

    boolean deleteById(int id);




}
