package com.screenmatch.exercises.module4.models;

import com.screenmatch.exercises.module4.interfaces.FinancialConversion;

public class CurrencyConvertor implements FinancialConversion {
    double dollarsToRealsConversionRate = 5.3;

    @Override
    public double convertDollarToReal(double dollars) {
        return dollars * dollarsToRealsConversionRate;
    }
}
