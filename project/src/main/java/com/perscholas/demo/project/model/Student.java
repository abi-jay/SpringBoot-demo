package com.perscholas.demo.project.model;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Student {

    private String firstName;
    private String lastName;
    private String email;

    @Setter(AccessLevel.NONE)
    private String studentId;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}