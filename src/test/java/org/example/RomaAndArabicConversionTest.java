package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomaAndArabicConversionTest {
    @Test
    public  void  isNotNull(){
        assertNotNull(Convertor.convertToRomanNumerals( 1001));
    }
    @Test
    public void isNull(){
        assertNull(Convertor.convertToRomanNumerals(4001));
    }

    @Test
    public void whenNumberIs2734(){
        assertEquals("MMDCCXXXIV", Convertor.convertToRomanNumerals(2734));
    }

    @Test
    public void whenNumberIs621(){
        assertEquals("DCXXI", Convertor.convertToRomanNumerals(621));
    }

    @Test
    public void whenNumberIs1743(){
        assertEquals("MDCCXLIII", Convertor.convertToRomanNumerals(1743));
    }

    @Test
    public void whenNumberIs3388(){
        assertEquals("MMMCCCLXXXVIII", Convertor.convertToRomanNumerals(3388));
    }

    @Test
    public void whenNumberIs819(){
        assertEquals("DCCCXIX", Convertor.convertToRomanNumerals(819));
    }

    @Test
    public void whenNumberIs2023(){
        assertEquals("MMXXIII", Convertor.convertToRomanNumerals(2023));
    }

    @Test
    public void whenNumberIs3546(){
        assertEquals("MMMDXLVI", Convertor.convertToRomanNumerals(3546));
    }

    @Test
    public void whenNumberIs249(){
        assertEquals("CCXLIX", Convertor.convertToRomanNumerals(249));
    }

    @Test
    public void whenNumberIs1237(){
        assertEquals("MCCXXXVII", Convertor.convertToRomanNumerals(1237));
    }

    @Test
    public void whenNumberIs3679(){
        assertEquals("MMMDCLXXIX", Convertor.convertToRomanNumerals(3679));
    }

    @Test
    public void whenNumberIs950(){
        assertEquals("CML", Convertor.convertToRomanNumerals(950));
    }

    @Test
    public void whenNumberIs1945(){
        assertEquals("MCMXLV", Convertor.convertToRomanNumerals(1945));
    }

    @Test
    public void whenNumberIs3748(){
        assertEquals("MMMDCCXLVIII", Convertor.convertToRomanNumerals(3748));
    }

    @Test
    public void whenNumberIs299(){
        assertEquals("CCXCIX", Convertor.convertToRomanNumerals(299));
    }

    @Test
    public void whenNumberIs1444(){
        assertEquals("MCDXLIV", Convertor.convertToRomanNumerals(1444));
    }

    @Test
    public void whenNumberIs2000(){
        assertEquals("MM", Convertor.convertToRomanNumerals(2000));
    }

    @Test
    public void whenNumberIs3721(){
        assertEquals("MMMDCCXXI", Convertor.convertToRomanNumerals(3721));
    }

    @Test
    public void whenNumberIs305(){
        assertEquals("CCCV", Convertor.convertToRomanNumerals(305));
    }

    @Test
    public void whenNumberIs287(){
        assertEquals("CCLXXXVII", Convertor.convertToRomanNumerals(287));
    }

    @Test
    public void whenNumberIs1166(){
        assertEquals("MCLXVI", Convertor.convertToRomanNumerals(1166));
    }

    @Test
    public void whenNumberIs2277(){
        assertEquals("MMCCLXXVII", Convertor.convertToRomanNumerals(2277));
    }

    @Test
    public void whenNumberIs394(){
        assertEquals("CCCXCIV", Convertor.convertToRomanNumerals(394));
    }

    @Test
    public void whenNumberIs2666(){
        assertEquals("MMDCLXVI", Convertor.convertToRomanNumerals(2666));
    }

    @Test
    public void whenNumberIs1333(){
        assertEquals("MCCCXXXIII", Convertor.convertToRomanNumerals(1333));
    }

    @Test
    public void whenNumberIs3777(){
        assertEquals("MMMDCCLXXVII", Convertor.convertToRomanNumerals(3777));
    }

    @Test
    public void whenNumberIs111(){
        assertEquals("CXI", Convertor.convertToRomanNumerals(111));
    }

    @Test
    public void whenNumberIs2021(){
        assertEquals("MMXXI", Convertor.convertToRomanNumerals(2021));
    }

    @Test
    public void whenNumberIs3998(){
        assertEquals("MMMCMXCVIII", Convertor.convertToRomanNumerals(3998));
    }

    @Test
    public void whenNumberIs888(){
        assertEquals("DCCCLXXXVIII", Convertor.convertToRomanNumerals(888));
    }

    @Test
    public void whenNumberIs1632(){
        assertEquals("MDCXXXII", Convertor.convertToRomanNumerals(1632));
    }

    @Test
    public void whenNumberIs2555(){
        assertEquals("MMDLV", Convertor.convertToRomanNumerals(2555));
    }

    @Test
    public void whenNumberIs777(){
        assertEquals("DCCLXXVII", Convertor.convertToRomanNumerals(777));
    }

    @Test
    public void whenNumberIs2094(){
        assertEquals("MMXCIV", Convertor.convertToRomanNumerals(2094));
    }

    @Test
    public void whenNumberIs3105(){
        assertEquals("MMMCV", Convertor.convertToRomanNumerals(3105));
    }

    @Test
    public void whenNumberIs1010(){
        assertEquals("MX", Convertor.convertToRomanNumerals(1010));
    }

    @Test
    public void whenNumberIs2986(){
        assertEquals("MMCMLXXXVI", Convertor.convertToRomanNumerals(2986));
    }

    @Test
    public void whenNumberIs1689(){
        assertEquals("MDCLXXXIX", Convertor.convertToRomanNumerals(1689));
    }

    @Test
    public void whenNumberIs298(){
        assertEquals("CCXCVIII", Convertor.convertToRomanNumerals(298));
    }

    @Test
    public void whenNumberIs3812(){
        assertEquals("MMMDCCCXII", Convertor.convertToRomanNumerals(3812));
    }


}