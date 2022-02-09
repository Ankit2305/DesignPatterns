package com.ankit.abstractfactory;

public class RupayCreditCardFactory extends CreditCardFactory{
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new RupayGoldCreditCard();
            case PLATINUM:
                return new RupayPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new RupayValidator();
    }
}
