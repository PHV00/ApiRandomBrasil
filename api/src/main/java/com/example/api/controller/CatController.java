package com.example.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cats")
public class CatController{
    private List<Cat> cats = new ArrayList<>();

    public CatController(){
        cats.add(new Cat("Whiskers",5));
    }

    @GetMapping
    public ResponseEntity<List<Cat>> getAllCats(){
        if(cats.isEmpty()){
            return new ResponseEntity<>(httpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cats,httpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<Cat>> getACat(@PathVariable String  name){
        Optional<Cat> cat = cats.stream().filter(c -> c.getName().equals(name).findFirst());
        if(cat.isPresent()){
            return new ResponseEntity<>(cat.get(),httpStatus.OK);
        }
        return new ResponseEntity<>(cats,httpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<List<Cat>> createCat(@RequestBody Cat cat){
        cat.add(cat);
        return new ResponseEntity<>("GATO CRIADO COM SUCESSO",httpStatus.CREATED);
    }

    @PutMapping("/{name}")
    public ResponseEntity<String> updateCat(@PathVariable String name,@RequestBody Cat cat){
        boolean removed = cats.removeIf(cat -> cat.getName().equals(name));
        if(removed){
            return new ResponseEntity<>("Gato excluido com sucesso!",HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>("Gato não encontrado!",HttpStatus.NOT_FOUND);
        }
    }
}