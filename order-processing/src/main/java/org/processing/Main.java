package org.processing;

import org.processing.orderthreading.OrderThreading;

public class Main {
    public static void main(String[] args) {
        OrderProcessor<Electronics> electronicsOrder = new OrderProcessor<>(new Electronics("Laptop"));
        OrderProcessor<Clothing> clothingOrder = new OrderProcessor<>(new Clothing("T-Shirt"));

        OrderThreading orderThreading = new OrderThreading();

        Runnable electronicsTask = () -> electronicsOrder.process();
        Runnable clothingTask = () -> clothingOrder.process();

        orderThreading.submitOrder(electronicsTask);
        orderThreading.submitOrder(clothingTask);

        orderThreading.shutdown();


    }
}
