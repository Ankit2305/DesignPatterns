package com.ankit.abstractfactory;

public class RupayValidator extends Validator{
    @Override
    public boolean validate(CreditCard creditCard) {
        return false;
    }
}
