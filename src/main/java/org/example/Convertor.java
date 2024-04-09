package org.example;

import java.util.List;
import java.util.Scanner;

public class Convertor {

    public  static String convertToRomanNumerals(int number){
        List<RomanNumerals> romanNumerals = RomanNumerals.returnSortedList();
        int i = 0;
        String romanNumeral = "";
        while(number > 0){
            if (number >= romanNumerals.get(i).returnValue())
            {
                romanNumeral = romanNumeral + romanNumerals.get(i).toString();
                number -= romanNumerals.get(i).returnValue();
            }
            else
            {
                i++;
            }
        }
        return romanNumeral;
    }
}
