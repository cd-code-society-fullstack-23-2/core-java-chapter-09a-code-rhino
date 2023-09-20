package com.codedifferently.partA;

import com.codedifferently.inclass.CreditCard;
import com.codedifferently.inclass.InsufficientFundsException;
import com.codedifferently.inclass.NoInternetConnectionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreditCardTest {

    private CreditCard creditCard;

    @BeforeEach
    public void startUp(){
        creditCard = new CreditCard("Tariq", 1000.00);
    }

    @Test
    public void chargeTest01() throws InsufficientFundsException, NoInternetConnectionException {
        creditCard.charge(100.00);
        Double expected = 100.00;
        Double actual = creditCard.getCurrentAmount();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chargeTest02(){
        Assertions.assertThrows(InsufficientFundsException.class, ()->{
            creditCard.charge(1001.00);
        });
    }


}
