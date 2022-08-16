package com.example.demo.model;


import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Data
@Slf4j
@Builder
public class LombokPOJO {
    private String name;

    private  Integer age;

    public LombokPOJO(String name, Integer are) {
        this.name = name;
        this.age = are;
    }
}
