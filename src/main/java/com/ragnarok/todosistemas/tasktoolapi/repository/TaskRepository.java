package com.ragnarok.todosistemas.tasktoolapi.repository;

import com.ragnarok.todosistemas.tasktoolapi.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
