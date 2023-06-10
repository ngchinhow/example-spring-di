package com.example.springdi;

public class Buyer {
    public Car carWanted;
    public int budget;

    public Buyer(Car carWanted, int budget) {
        this.carWanted = carWanted;
        this.budget = budget;
    }
}
