package org.example;
/*
  @author   antihetman
  @project   TDD_Labs
  @class  dd
  @version  1.0.0
  @since 4/9/24 - 13.21
*/
import java.util.List;
import java.util.Scanner;

public class Convertor {

    public  static String convertToRomanNumerals(int number){
        if ((number > 4000)|| (number <= 0)){
            return null;
        }
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
