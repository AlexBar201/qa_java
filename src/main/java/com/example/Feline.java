package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

     Animal animalMock;
    public Feline(Animal animalMock) {
        this.animalMock = animalMock;
    }
    public Feline() {
    }

    @Override
    public List<String> eatMeat() throws Exception {
        return animalMock.getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
