package org.processing;

public class OrderProcessor<T> {
    private T product;

    public OrderProcessor(T product) {
        this.product = product;
    }

    public void process() {
        System.out.println("Processing order for product: " + product);
    }
}
