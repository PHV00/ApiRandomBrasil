package com.example.api.classes;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

public class Name extends ResponseValue implements APIFunctions {
    @Getter
    @Setter
    private int id;
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
        List<Name> namesWithFirstLetter = new ArrayList<>();

        for(Name name :DataBases.getDbNames()){
            if(name.value.charAt(0) == firstLetter.toUpperCase().charAt(0)){
                namesWithFirstLetter.add(name);
            }
        }

        Random random = new Random();
        int randomIdName = random.nextInt(namesWithFirstLetter.size());
        Name selectName=  namesWithFirstLetter.get(randomIdName);
        
        return selectName;
    }
    
    public Name getRandomValueByGender(boolean gender){
        List<Name> namesWithGender = new ArrayList<>();

        for(Name name :  DataBases.getDbNames()){
            if(name.gender == gender){
                namesWithGender.add(name);
            }
        }

        Random random = new Random();
        int randomIdName = random.nextInt(namesWithGender.size());
        Name selectName=  namesWithGender.get(randomIdName);

        return selectName;
    }
}
