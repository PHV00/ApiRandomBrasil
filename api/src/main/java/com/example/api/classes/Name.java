package com.example.api.classes;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;

public class Name extends ResponseValue {
    @Getter
    @Setter
    private int id;
    // 1 = Masculino
    // 2 = Feminino
    @Getter
    @Setter
    private boolean gender;

    public Name(int id,String name, int gender){
        super(name);
        this.gender = (gender != 0) ;
        this.id=id;
    }

    @Override
    public Name getRandomValue(){
        Random random = new Random();
        int randomIdName = random.nextInt(130-1);
        Name selectName=  DataBases.getDbNames().get(randomIdName);
        return selectName;
    }
    
    @Override
    public Name getRandomValueByFirstLetter(String firstLetter){
        Name name = new Name(1,"",1);
        return name;
    }
    
    @Override
    public Name getRandomValueByGender(boolean gender){
        Name name = new Name(1,"",1);
        return name;
    }
    
    @Override
    public Name getRandomListConcatValue(int listSize){
        Name name = new Name(1,"",1);
        return name;
    }
}
