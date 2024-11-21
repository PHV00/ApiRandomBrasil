package com.senai.api_novo.cat;

import lombok.Getter;
import lombok.Setter;

public class Cat{
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String breed;

    public Cat(String name, String age){
        this.name = name;
        this.age = age;
    }
}