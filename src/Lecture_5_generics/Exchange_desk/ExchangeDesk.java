package Lecture_5_generics.Exchange_desk;

import Lecture_4_Exceptions_IO.Ex1.DivByZeroException;

public abstract class ExchangeDesk {
    public static <T extends Currency, K extends Currency>int convertFT(T fromCurrency,K toCurrency, int amountToConvert) throws IllegalArgumentException {
        if(fromCurrency.getAbsRate()==0 || toCurrency.getAbsRate()==0){
            throw new IllegalArgumentException("No currency can have absRate equal to zero.");
        }
        fromCurrency.setCrtAmount(fromCurrency.getCrtAmount()-amountToConvert);
        return amountToConvert*fromCurrency.getAbsRate()/ toCurrency.getAbsRate();
    }
}
