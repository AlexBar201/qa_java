package com.example;

import java.util.List;

public class Cat {

    Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public Cat(){

    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
///////////////////какие тесты будут///////////////////
//Самый простой тест это тест на getSound, нужно вызвать тест и проверить строку
//тест на getFood сложнее, нужно писать через мокирование