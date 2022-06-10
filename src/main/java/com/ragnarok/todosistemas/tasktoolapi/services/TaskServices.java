package com.ragnarok.todosistemas.tasktoolapi.services;

import com.ragnarok.todosistemas.tasktoolapi.model.Task;

import java.text.ParseException;
import java.util.List;

public interface TaskServices {

    //Get Task List
    List<Task> getTaskList();

    //Add Task List
    Task addTask(Task task);

    //Update Task
    Task updateTask(Task task);

    //Delete Task
    boolean deleteTask(Long id);
}
