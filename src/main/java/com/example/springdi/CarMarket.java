package com.example.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarMarket {
    public FirstCarDealership firstCarDealership;
    public SecondCarDealership secondCarDealership;
    public ThirdCarDealership thirdCarDealership;

    @Autowired
    public CarMarket(FirstCarDealership first, SecondCarDealership second, ThirdCarDealership third) {
        this.firstCarDealership = first;
        this.secondCarDealership = second;
        this.thirdCarDealership = third;
    }

    public Integer searchMarket(Buyer buyer) {
        Integer priceAtFirst = firstCarDealership.getPrice(buyer.carWanted);
        Integer priceAtSecond = secondCarDealership.getPrice(buyer.carWanted);
        Integer priceAtThird = thirdCarDealership.getPrice(buyer.carWanted);

        Integer minimumCost = buyer.budget;
        boolean found = false;

        if (priceAtFirst < minimumCost) {
            minimumCost = priceAtFirst;
            found = true;
        }
        if (priceAtSecond < minimumCost) {
            minimumCost = priceAtSecond;
            found = true;
        }
        if (priceAtThird < minimumCost) {
            minimumCost = priceAtThird;
            found = true;
        }

        if (found) {
            return minimumCost;
        } else {
            return null;
        }
    }
}
