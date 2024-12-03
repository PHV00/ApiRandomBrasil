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

    @GetMapping("/")
    public ResponseEntity<String> getApiRoot(){
        String welcome = 
        "Olá bem vindo a api :)"
        +"\n Experimente digitar:"
        +"\n /nome"
        +"\n /sobrenome"
        +"\n /nome-completo";
        return new ResponseEntity<>(welcome,HttpStatus.OK);
    }

    @GetMapping("/nome")
    public ResponseEntity<String> getRandomName(){
        Name selectName = new Name(0,"",0); 
        return new ResponseEntity<>(selectName.getRandomValue().getValue(),HttpStatus.OK);
    }
    
    @GetMapping("/nome/{firstLetter}")
    public ResponseEntity<String> getRandomNameByFirstLetter(@PathVariable String  firstLetter){
        Name selectName = new Name(0,"",0);
        return new ResponseEntity<>(selectName.getRandomValueByFirstLetter(firstLetter).getValue(),HttpStatus.OK);
    }

    
    @GetMapping("/nome/genero/{gender}")
    public ResponseEntity<String> getRandomNameByGender(@PathVariable String gender){
        Name selectName = new Name(0,"",0);
        Name response;

        if (gender.toUpperCase().equals("MASCULINO")){
            response = selectName.getRandomValueByGender(true);
            return new ResponseEntity<>(response.getValue(),HttpStatus.OK);
        }
        if(gender.toUpperCase().equals("FEMININO")){
            response = selectName.getRandomValueByGender(false);
            return new ResponseEntity<>(response.getValue(),HttpStatus.OK);
        }

        return new ResponseEntity<>("ERROR URL CONTEM GENERO INVALIDO",HttpStatus.OK);
    }
    
    @GetMapping("/sobrenome")
    public ResponseEntity<String> getRandomSurname(){
        Surname selectSurname = new Surname(0,"");
        return new ResponseEntity<>(selectSurname.getRandomValue().getValue(),HttpStatus.OK);
    }

    @GetMapping("/sobrenome/{firstLetter}")
    public ResponseEntity<String> getRandomSurnameByFirstLetter(@PathVariable String  firstLetter){
        Surname selectSurname = new Surname(0,"");
        return new ResponseEntity<>(selectSurname.getRandomValueByFirstLetter(firstLetter).getValue(),HttpStatus.OK);
    }

}