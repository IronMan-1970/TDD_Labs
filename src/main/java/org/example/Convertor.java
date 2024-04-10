package org.example;
/*
  @author   antihetman
  @project   TDD_Labs
  @class  dd
  @version  1.0.0
  @since 4/9/24 - 13.21
*/


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;



public class Convertor {

     public static int convertRomanToArabic(String romanNumeral) {
           if (romanNumeral == null) {
                 throw new IllegalArgumentException(" cannot be converted to a Roman Numeral");
           }

           if (romanNumeral.length() == 0) {
                throw new IllegalArgumentException(" cannot be converted to a Roman Numeral");
          }

         romanNumeral.toUpperCase();
         int result = 0;

         List<RomanNumerals> romanNumerals = RomanNumerals.returnSortedList();
         int i = 0;

         while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
             RomanNumerals symbol = romanNumerals.get(i);
             if (romanNumeral.startsWith(symbol.name())) {
                 result += symbol.returnValue();
                 romanNumeral = romanNumeral.substring(symbol.name().length());
             }
             else {
                  i++;
             }
         }

          if (romanNumeral.length() > 0) {
                throw new IllegalArgumentException(" cannot be converted to a Roman Numeral");
          }

          return result;

     }

}
