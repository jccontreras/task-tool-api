package com.ragnarok.todosistemas.tasktoolapi.services;

import com.ragnarok.todosistemas.tasktoolapi.model.Task;
import com.ragnarok.todosistemas.tasktoolapi.model.User;

import java.util.List;

public interface UserServices {

    //Get a User By Id
    User getUserById(Long id);

    //Get Users List
    List<User> getUserList();

    //Add a new User
    User addUser(User user);

    //Update User
    User updateUser(User user);

    //Delete User
    boolean deleteUser(Long id);
}
