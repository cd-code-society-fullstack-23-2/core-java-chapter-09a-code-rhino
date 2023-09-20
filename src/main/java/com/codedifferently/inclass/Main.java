package com.codedifferently.inclass;

public class Main {

    public void run(){
        try {
            CreditCard creditCard = new CreditCard("Tariq", 10.00);
            creditCard.charge(3.00);
        }catch(InsufficientFundsException e){
            System.out.println("Please get ya money up");
        }catch (NoInternetConnectionException e){
            System.out.println("Internet is down");
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
