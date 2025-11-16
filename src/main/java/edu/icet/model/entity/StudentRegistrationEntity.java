package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity


public class StudentRegistrationEntity {

    @Id
    private String studentId;
    private String nic;
    private String name;
    private LocalDate dob;
    private String gender;
    private String email;
    private String phoneNo;
    private String address;
    private String courseType;
}
