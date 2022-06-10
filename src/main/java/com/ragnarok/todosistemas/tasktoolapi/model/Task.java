package com.ragnarok.todosistemas.tasktoolapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.swing.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "task_name",length = 20, nullable = false)
    private String name;

    @Column(name = "task_description",length = 200, nullable = false)
    private String description;

    @Column(name = "task_state", length = 1, nullable = false)
    private String state;

    @Column(name = "task_employee", nullable = false)
    private Long employee;

    @Column(name = "task_creation_date")
    private LocalDate creationDate;

    @Column(name = "task_do_date", nullable = false)
    private LocalDate toDoDate;
}
