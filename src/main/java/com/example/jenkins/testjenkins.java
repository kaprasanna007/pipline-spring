package com.example.jenkins;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/test")
@AllArgsConstructor


public class testjenkins {

    @GetMapping
    public String heleth(){

        return  "hello every one jenkines is working by prasanna";
    }




}
