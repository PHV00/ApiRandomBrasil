package com.example.api.classes;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;

public class Surname extends ResponseValue{
    @Getter
    @Setter
    private int id;

    public Surname(int id,String surname){
        super(surname);
        this.id=id;
    }

    @Override
    public Surname getRandomValue(){
        Random random = new Random();
        int randomIdSurname = random.nextInt(50);
        Surname selectSurname= DataBases.getDbSurnames().get(randomIdSurname);
        return selectSurname;
    }

    @Override
    public Surname getRandomValueByFirstLetter(String firstLetter){
        Surname name = new Surname(1,"");
        return name;
    }
    
    @Override
    public Surname getRandomValueByGender(boolean gender){
        Surname name = new Surname(1,"");
        return name;
    }
    
    @Override
    public Surname getRandomListConcatValue(int listSize){
        Surname name = new Surname(1,"");
        return name;
    }
}
