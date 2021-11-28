package com.demo.springbootkafka.model;

import lombok.Data;
import java.util.List;

@Data
public class Response {
    private String status;
    private List<UserData> userData;
}
