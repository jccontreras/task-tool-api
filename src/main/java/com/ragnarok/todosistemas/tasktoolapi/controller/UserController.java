package com.ragnarok.todosistemas.tasktoolapi.controller;

import com.ragnarok.todosistemas.tasktoolapi.model.Task;
import com.ragnarok.todosistemas.tasktoolapi.model.User;
import com.ragnarok.todosistemas.tasktoolapi.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserServices userServices;

    @GetMapping()
    public List<User> getTaskList() {
        return userServices.getUserList();
    }

    @GetMapping("/{id}")
    public User getTaskList(@PathVariable("id") Long id) {
        return userServices.getUserById(id);
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody User user) {
        return new ResponseEntity(userServices.addUser(user), HttpStatus.CREATED);
    }
}
