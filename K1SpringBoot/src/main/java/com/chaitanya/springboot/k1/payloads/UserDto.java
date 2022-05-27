package com.chaitanya.springboot.k1.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private int id;
    @NotEmpty
    @Size(min = 4,message = "Username ,ust be min of 4 characters")
    private String name;

    @Email(message="Email address is  not valid !!")
    private String email;

    @NotEmpty
    @Size(min=3, max=10, message="Password must be min of 3 characters and max of 10 characters")
    private String password;

    @NotEmpty
    private String about;
}
