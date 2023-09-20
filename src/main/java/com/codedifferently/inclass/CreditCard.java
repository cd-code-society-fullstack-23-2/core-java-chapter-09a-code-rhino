package com.codedifferently.inclass;

public class CreditCard {
    private static int cardCount = 1;
    private Integer id;
    private String name;
    private Double currentAmount;
    private Double creditLimit;

    public CreditCard(String name, Double creditLimit){
        this.name = name;
        this.creditLimit = creditLimit;
        currentAmount = 0.0;
        id = cardCount++;
    }

    public void charge(Double amount) throws InsufficientFundsException, NoInternetConnectionException{
        checkInternet();
        Double potentialCharge = amount + currentAmount;
        if(potentialCharge > creditLimit) {
            throw new InsufficientFundsException("Ya Broke");
        }
        currentAmount += amount;
    }

    public Double getCurrentAmount(){
        return currentAmount;
    }

    public static void checkInternet() throws NoInternetConnectionException{
        if(!CricketProvider.connected())
            throw new NoInternetConnectionException("Get off of Cricket");
    }
}
