package org.processing;

public class Clothing extends Product {
    public Clothing(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Clothing: " + getName();
    }
}
