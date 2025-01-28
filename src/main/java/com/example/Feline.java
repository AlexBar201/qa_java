package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {      //Это взяли из интерфейса
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }       //Это взяли из Энимал.джава

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
