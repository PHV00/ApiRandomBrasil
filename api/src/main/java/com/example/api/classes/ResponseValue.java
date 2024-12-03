package com.example.api.classes;

import lombok.Getter;
import lombok.Setter;

public abstract class ResponseValue {
    @Getter
    @Setter
    protected String value;

    public ResponseValue(String value){
        this.value = value;
    }
}
