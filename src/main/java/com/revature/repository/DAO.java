package com.revature.repository;

import com.revature.model.User;

import java.util.List;

// T is a generic class data type
public interface DAO<T> {

 T create(T t);

 User create(User user);

 List<T> getAll();

 T getById(int id);

 T update(T t);

 boolean deleteById(int id);

 User getByID(int id);
}
