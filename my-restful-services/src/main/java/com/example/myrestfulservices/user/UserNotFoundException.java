package com.example.myrestfulservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Status Code
//2XX -> OK(정상처리)
//4XX -> Client 오류
//5XX -> Server 오류
@ResponseStatus(HttpStatus.NOT_FOUND) //404
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
