package com.ragnarok.todosistemas.tasktoolapi.services;

import com.ragnarok.todosistemas.tasktoolapi.model.User;

import java.util.List;

public interface UserServices {

    User getUserById(Long id);

    List<User> getUserList();
}
