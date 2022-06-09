package com.ragnarok.todosistemas.tasktoolapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "user_dni", nullable = false)
    private String dni;

    @Column(name = "user_contact_number", nullable = false, length = 10)
    private String contactNumber;

    @Column(name = "user_email", nullable = false, length = 10)
    private String email;

    @Column(name = "user_employee_id", nullable = false, length = 6)
    private String employeeId;
}