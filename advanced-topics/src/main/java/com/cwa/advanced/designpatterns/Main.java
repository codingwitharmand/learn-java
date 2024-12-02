package com.cwa.advanced.designpatterns;

public class Main {

    public static void main(String[] args) {
        Database db = Database.getInstance();

        //Test Factory
        Animal sparky = AnimalFactory.getAnimal("dog");
        sparky.scream();
        Animal russo = AnimalFactory.getAnimal("cat");
        russo.scream();

        // Test Strategy
        Cart cart = new Cart(new CardStrategy());
        cart.pay(500);

        Cart cart1 = new Cart(new PayPalStrategy());
        cart1.pay(700);
    }
}
