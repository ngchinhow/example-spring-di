package com.example.springdi;

import org.springframework.stereotype.Repository;

@Repository
public class ThirdCarDealership {

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
            return 12000;
        } else if (car.brand.equals("Toyota")) {
            return 22000;
        } else {
            return 32000;
        }
    }
}
