package com.hospitalmanagment.hospitalManagment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(
        name = "patient",
        uniqueConstraints = {@UniqueConstraint(name = "unique_patient_name_birthdate", columnNames = {"name", "dateofbirth"}),
        },
        indexes = @Index(name = "inx_dateofbirth",columnList = "dateofbirth")
)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,length = 40)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @ToString.Exclude
    private LocalDate dateofbirth;

    private String gender;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createAT;

    private String bloodGroup;

}
