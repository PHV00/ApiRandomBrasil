package com.example.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.api.classes.DataBases;
import com.example.api.classes.Name;
import com.example.api.classes.Surname;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/hub")
public class Controller {
    public Controller(){
        DataBases.getInstance();
    }

    // @GetMapping("/")
    // public ResponseEntity<String> getRandomName(){
    //     System.out.println("((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))");
    //     System.out.println(DataBases.getDbNames().get(1).getWord());

    //     return new ResponseEntity<>("ok",HttpStatus.OK);
    // }

    @GetMapping("/nome")
    public ResponseEntity<String> getRandomName(){
        Name selectName = new Name(0,"",0); 
        return new ResponseEntity<>(selectName.getRandomValue().getValue(),HttpStatus.OK);
    }
    
    // @GetMapping("/sobrenome")
    // public ResponseEntity<String> getRandomSurname(){
    //     Surname selectSurname = Surname.randomSurname();
    //     return new ResponseEntity<>(selectSurname.getWord(),HttpStatus.OK);
    // }

    // @GetMapping("/nomecompleto")
    // public ResponseEntity<String> getRandomCompleteName(){
        
    //     return new ResponseEntity<>(selectSurname.getWord(),HttpStatus.OK);
    // }

    // @GetMapping("/nome/{firstLetter}")
    // public ResponseEntity<List<Name>> getACat(@PathVariable String  firstLetter){
    //     Optional<Name> namesWithALetter = dbSurnames.stream().filter(name -> name.getSurname().equals(name));

    //     System.out.println("****************");
    //     System.out.println(namesWithALetter);
        
    //     if(namesWithALetter.isPresent()){
    //         return new ResponseEntity<>(namesWithALetter.get(),HttpStatus.OK);
    //     }
    //     return new ResponseEntity<>(namesWithALetter,HttpStatus.NOT_FOUND);
    // }

}