package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class StudentRegistration {
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
