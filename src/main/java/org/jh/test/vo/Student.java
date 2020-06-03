package org.jh.test.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Student {

    private int id;
    private String name;
    private String code;
    private LocalDateTime saveDate = LocalDateTime.now();

    public Student(String name, String code){
        this.name = name;
        this.code = code;
    }



}
