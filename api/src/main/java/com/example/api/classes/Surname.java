package com.example.api.classes;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

public class Surname extends ResponseValue implements APIFunctions{
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
        List<Surname> surnameWithFirstLetter = new ArrayList<>();

        for(Surname surname :DataBases.getDbSurnames()){
            if(surname.value.charAt(0) == firstLetter.toUpperCase().charAt(0)){
                surnameWithFirstLetter.add(surname);
            }
        }

        Random random = new Random();
        int randomIdSurname = random.nextInt(surnameWithFirstLetter.size());
        Surname selectSurname=  surnameWithFirstLetter.get(randomIdSurname);
        
        return selectSurname;
    }
}
