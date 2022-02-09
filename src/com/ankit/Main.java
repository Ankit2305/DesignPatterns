package com.ankit;


import com.ankit.abstractfactory.CardType;
import com.ankit.abstractfactory.CreditCard;
import com.ankit.abstractfactory.CreditCardFactory;

public class Main {

    public static void main(String[] args) {
        CreditCardFactory factory = CreditCardFactory.getCreditCardFactory(400);
        CreditCard creditCard = factory.getCreditCard(CardType.PLATINUM);
        System.out.println(creditCard.getClass().getSimpleName());
    }
}
