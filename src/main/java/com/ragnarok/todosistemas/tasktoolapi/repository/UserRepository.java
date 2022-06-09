package com.ragnarok.todosistemas.tasktoolapi.repository;

import com.ragnarok.todosistemas.tasktoolapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
