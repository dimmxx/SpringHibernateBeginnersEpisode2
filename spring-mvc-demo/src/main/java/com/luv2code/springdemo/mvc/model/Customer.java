package com.luv2code.springdemo.mvc.model;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull (message = "null is not permitted")
    @Size(min = 3, message = "is required")
    private String lastName;

    @NotNull (message = "null is not permitted")
    @Min(value = 0, message = "cannot be less than 0")
    @Max(value = 10, message = "cannot be greater than 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "must have not more than 5 digits")
    private String postalCode;

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
