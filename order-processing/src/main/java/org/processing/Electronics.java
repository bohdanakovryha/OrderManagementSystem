package org.processing;

public class Electronics extends Product {
    public Electronics(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Electronics: " + getName();
    }
}
