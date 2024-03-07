package com.directi.training.lsp.exercise;

public class ElectronicDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Electronic duck quack...");
    }

    @Override
    public void swim() {
        System.out.println("Electronic duck swim");
    }
}
