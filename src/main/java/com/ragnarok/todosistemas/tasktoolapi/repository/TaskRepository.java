package com.ragnarok.todosistemas.tasktoolapi.repository;

import com.ragnarok.todosistemas.tasktoolapi.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
