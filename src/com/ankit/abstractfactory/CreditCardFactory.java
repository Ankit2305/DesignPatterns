package com.ankit.abstractfactory;

//Abstract factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if(creditScore > 650) {
            return new RupayCreditCardFactory();
        } else {
            return new VisaCreditCardFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
