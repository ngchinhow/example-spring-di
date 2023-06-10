package com.example.springdi;

import org.springframework.stereotype.Repository;

@Repository
public class SecondCarDealership {

    public boolean isAvailable(Car car) {
        if (car.brand.equals("Honda")) {
            return true;
        } else if (car.brand.equals("Toyota")) {
            return true;
        } else if (car.brand.equals("Hyundai")) {
            return true;
        } else {
            return false;
        }
    }

    public Integer getPrice(Car car) {
        if (!isAvailable(car)) {
            return Integer.MAX_VALUE;
        } else if (car.brand.equals("Honda")) {
            return 9000;
        } else if (car.brand.equals("Toyota")) {
            return 19000;
        } else {
            return 29000;
        }
    }
}
