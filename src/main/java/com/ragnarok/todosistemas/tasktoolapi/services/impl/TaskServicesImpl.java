package com.ragnarok.todosistemas.tasktoolapi.services.impl;

import com.ragnarok.todosistemas.tasktoolapi.model.Task;
import com.ragnarok.todosistemas.tasktoolapi.repository.TaskRepository;
import com.ragnarok.todosistemas.tasktoolapi.services.TaskServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class TaskServicesImpl implements TaskServices {

    @Autowired
    private final TaskRepository taskRepository;

    @Override
    public List<Task> getTaskList() {
        return taskRepository.findAll();
    }

    @Override
    public Task addTask(Task task) {
        task.setCreationDate(LocalDate.now());
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        Task searchtask = taskRepository.findById(task.getId()).get();
        searchtask.setName(task.getName());
        searchtask.setDescription(task.getDescription());
        searchtask.setToDoDate(task.getToDoDate());
        searchtask.setEmployee(task.getEmployee());
        searchtask.setState(task.getState());
        return taskRepository.save(searchtask);
    }

    @Override
    public boolean deleteTask(Long id) {
        try {
            taskRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}