package com.luv2code.jackson.json.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {

    private String street;
    private String city;
    private String state;
    private int zip;
    private String country;

}
