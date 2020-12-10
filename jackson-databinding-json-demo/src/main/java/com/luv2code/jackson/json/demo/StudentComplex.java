package com.luv2code.jackson.json.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString (callSuper = true)
public class StudentComplex extends Student {

    private Address address;
    private String[] languages;

}

