package com.luv2code.rest.error;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentErrorResponse {

    private int status;
    private String message;
    private String timeStamp;

}
