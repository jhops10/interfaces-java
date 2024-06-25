package model.services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

    default double payment(Double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months mus be greater than zero");
        }
        return amount * Math.pow((1 + getInterestRate() / 100), months);
    }
}
