package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {


//    @NotNull  Field should not be null
//    @NotEmpty Field should not be ""
//    @NotBlank Field should not be "          "
//
    //@NotNull -> @NotNull
    //@NotEmpty -> @NotNull + @NotEmpty
    //@NotBlank -> @NotNull + @NotEmpty + @NotBlank

    @NotBlank
    @Size (max = 12, min = 2)
    private String firstName;
    private String lastName;

    //Thymeleaf accepts yyyy-MM-dd, but localDate accepts mm-dd-yyyy yyyy-dd-mm
//    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

//    @NotBlank
//    @Email
    private String email;

//    @NotBlank
//    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;

    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
