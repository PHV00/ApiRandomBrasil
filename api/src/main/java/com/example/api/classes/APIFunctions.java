package com.example.api.classes;

public interface APIFunctions {
    Object getRandomValue();
    Object getRandomValueByFirstLetter(String firstLetter);
    Object getRandomValueByGender(boolean gender);
    Object getRandomListConcatValue(int listSize);
}