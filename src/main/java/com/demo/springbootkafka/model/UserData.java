package com.demo.springbootkafka.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserData {

    public UserData(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    private String name;
    private String gender;
    private int age;

}
