package main.java.training.oop.Shop;

abstract class Product {
    protected String name;
    protected double price;

    @Override
    public String toString() {
        return new StringBuilder("Product: ")
                .append(name).append(" : ")
                .append(price).toString();
    }
}