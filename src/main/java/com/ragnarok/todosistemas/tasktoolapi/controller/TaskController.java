package com.ragnarok.todosistemas.tasktoolapi.controller;

import com.ragnarok.todosistemas.tasktoolapi.model.Task;
import com.ragnarok.todosistemas.tasktoolapi.services.TaskServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    @Autowired
    private final TaskServices taskServices;

    @GetMapping()
    public List<Task> getTaskList() {
        return taskServices.getTaskList();
    }

    @PostMapping
    public ResponseEntity createTask(@RequestBody Task task) {
        return new ResponseEntity(taskServices.addTask(task), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updateTask(@RequestBody Task task) {
        return new ResponseEntity(taskServices.updateTask(task), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTask(@PathVariable("id") Long id) {
        if (taskServices.deleteTask(id)) { return new ResponseEntity(HttpStatus.OK); }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}