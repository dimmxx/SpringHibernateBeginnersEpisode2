package com.luv2code.jackson.json.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Student {

    private long id;
    private String firstName;
    private String lastName;
    private boolean active;

}
