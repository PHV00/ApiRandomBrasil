package com.example.api.classes;

import lombok.Getter;
import lombok.Setter;

public class Name {
    @Getter
    @Setter
    private int id;
    // 1 = Masculino
    // 2 = Feminino
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private boolean gender;

    public Name(int id,String name, String gender){
        this.name=name;
        this.gender = gender;
        this.id=id;
    }
}
