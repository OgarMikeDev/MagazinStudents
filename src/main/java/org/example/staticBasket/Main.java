package org.example.staticBasket;

import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Basket basketAik = new Basket("Items Aik");
        Session basketMisha = new Session();


        System.out.println("Basket Aik: ".concat(basketAik.toString())
                .concat("\nBasketMisha: ").concat(basketMisha.toString())
                .concat("\nCount basket equals: ".concat(String.valueOf(Basket.countItems))));
    }
}