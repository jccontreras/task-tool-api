package com.ragnarok.todosistemas.tasktoolapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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

    @Column(name = "task_name",length = 60)
    private String name;

    @Column(name = "task_description",length = 200)
    private String description;

    @Column(name = "task_state", length = 1)
    private String state;

    @Column(name = "task_assigned_employee")
    private String employee;

    @Column(name = "task_creation_date")
    private LocalDate creationDate;

    @Column(name = "task_do_date")
    private LocalDate toDoDate;
}
