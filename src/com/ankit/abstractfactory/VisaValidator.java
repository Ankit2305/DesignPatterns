package com.ankit.abstractfactory;

public class VisaValidator extends Validator{
    @Override
    public boolean validate(CreditCard creditCard) {
        return false;
    }
}
