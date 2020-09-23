package com.luv2code.rest.error;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class StudentErrorResponse {

    private int status;
    private String message;
    private String timeStamp;

}
