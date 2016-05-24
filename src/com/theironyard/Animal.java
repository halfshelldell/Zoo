package com.theironyard;

/**
 * Created by illladell on 5/24/16.
 */
public class Animal {
    String name;

    public void makeSound() {
        System.out.println("Animal Sounds!!!");
    }

    @Override
    public String toString() {
        return name;
    }
}
