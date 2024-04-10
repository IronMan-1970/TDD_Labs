package org.example;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/*
  @author   antihetman
  @project   TDD_Labs
  @class  ConvertorTest
  @version  1.0.0 
  @since 4/9/24 - 13.31
*/
public class ConvertorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void whenRomanNumberIsEmptyThenTrowException()
    {
        Exception exception = Assertions.assertThrows(Exception.class, () -> { Convertor
                .convertRomanToArabic("");
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals(exception.getMessage(), " cannot be converted to a Roman Numeral");

    }
    @Test
    public void whenRomanNumberIsTrashThenTrowException()
    {
        Exception exception = Assertions.assertThrows(Exception.class, () -> { Convertor
                .convertRomanToArabic("lsehsd.hfsnbdfx");
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals(exception.getMessage(), " cannot be converted to a Roman Numeral");

    }
    @Test
    public void whenRomanNumberIsNullThenTrowException()
    {
        Exception exception = Assertions.assertThrows(Exception.class, () -> { Convertor
                .convertRomanToArabic(null);
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals(exception.getMessage(), " cannot be converted to a Roman Numeral");

    }
    @Test
    public void whenTheRomanNumberIsIII_Then3()
    {
        Assertions.assertEquals(3,Convertor.convertRomanToArabic("III"));
    }
    @Test
    public void whenTheRomanNumberIsDCCCLXXXVII_Then887() {
        Assertions.assertEquals(887, Convertor.convertRomanToArabic("DCCCLXXXVII"));
    }

    @Test
    public void whenTheRomanNumberIsMMXIX_Then2019() {
        Assertions.assertEquals(2019, Convertor.convertRomanToArabic("MMXIX"));
    }




    @Test
    public void whenTheRomanNumberIsMCCXXX_Then1230() {
        Assertions.assertEquals(1230, Convertor.convertRomanToArabic("MCCXXX"));
    }

    @Test
    public void whenTheRomanNumberIsCDLVI_Then456() {
        Assertions.assertEquals(456, Convertor.convertRomanToArabic("CDLVI"));
    }
    @Test
    public void whenTheRomanNumberIsDCCLXXXIX_Then789() {
        Assertions.assertEquals(789, Convertor.convertRomanToArabic("DCCLXXXIX"));
    }

    @Test
    public void whenTheRomanNumberIsMCXI_Then1111() {
        Assertions.assertEquals(1111, Convertor.convertRomanToArabic("MCXI"));
    }

    @Test
    public void whenTheRomanNumberIsMMCCXXII_Then2222() {
        Assertions.assertEquals(2222, Convertor.convertRomanToArabic("MMCCXXII"));
    }

    @Test
    public void whenTheRomanNumberIsMMMMCDXLIV_Then4444() {
        Assertions.assertEquals(4444, Convertor.convertRomanToArabic("MMMMCDXLIV"));
    }


    @Test
    public void whenTheRomanNumberIsX_Then10() {
        Assertions.assertEquals(10, Convertor.convertRomanToArabic("X"));
    }

    @Test
    public void whenTheRomanNumberIsMMXXIV_Then2024() {
        Assertions.assertEquals(2024, Convertor.convertRomanToArabic("MMXXIV"));
    }

    @Test
    public void whenTheRomanNumberIsMMMXXX_Then3030() {
        Assertions.assertEquals(3030, Convertor.convertRomanToArabic("MMMXXX"));
    }

    @Test
    public void whenTheRomanNumberIsMDL_Then1550() {
        Assertions.assertEquals(1550, Convertor.convertRomanToArabic("MDL"));
    }

    @Test
    public void whenTheRomanNumberIsMCMXC_Then1990() {
        Assertions.assertEquals(1990, Convertor.convertRomanToArabic("MCMXC"));
    }

    @Test
    public void whenTheRomanNumberIsMCCXIII_Then1213() {
        Assertions.assertEquals(1213, Convertor.convertRomanToArabic("MCCXIII"));
    }

    @Test
    public void whenTheRomanNumberIsMDCCCXVIII_Then1818() {
        Assertions.assertEquals(1818, Convertor.convertRomanToArabic("MDCCCXVIII"));
    }

    @Test
    public void whenTheRomanNumberIsMMCMXLIX_Then2949() {
        Assertions.assertEquals(2949, Convertor.convertRomanToArabic("MMCMXLIX"));
    }

    @Test
    public void whenTheRomanNumberIsMMMC_Then3100() {
        Assertions.assertEquals(3100, Convertor.convertRomanToArabic("MMMC"));
    }

    @Test
    public void whenTheRomanNumberIsMMCCCIII_Then2303() {
        Assertions.assertEquals(2303, Convertor.convertRomanToArabic("MMCCCIII"));
    }

    @Test
    public void whenTheRomanNumberIsMCDXLII_Then1442() {
        Assertions.assertEquals(1442, Convertor.convertRomanToArabic("MCDXLII"));
    }

    @Test
    public void whenTheRomanNumberIsMMCCCLXXVIII_Then2378() {
        Assertions.assertEquals(2378, Convertor.convertRomanToArabic("MMCCCLXXVIII"));
    }

    @Test
    public void whenTheRomanNumberIsMMMMCMXCVIII_Then4998() {
        Assertions.assertEquals(4998, Convertor.convertRomanToArabic("MMMMCMXCVIII"));
    }

    @Test
    public void whenTheRomanNumberIsCDXC_Then490() {
        Assertions.assertEquals(490, Convertor.convertRomanToArabic("CDXC"));
    }

    @Test
    public void whenTheRomanNumberIsMMCMXXXIV_Then2934() {
        Assertions.assertEquals(2934, Convertor.convertRomanToArabic("MMCMXXXIV"));
    }

    @Test
    public void whenTheRomanNumberIsMCMXXIII_Then1923() {
        Assertions.assertEquals(1923, Convertor.convertRomanToArabic("MCMXXIII"));
    }

    @Test
    public void whenTheRomanNumberIsMMMCMLXXXVII_Then3987() {
        Assertions.assertEquals(3987, Convertor.convertRomanToArabic("MMMCMLXXXVII"));
    }

    @Test
    public void whenTheRomanNumberIsMMMMCDXIV_Then4414() {
        Assertions.assertEquals(4414, Convertor.convertRomanToArabic("MMMMCDXIV"));
    }

    @Test
    public void whenTheRomanNumberIsMMMCCCXXXI_Then3331() {
        Assertions.assertEquals(3331, Convertor.convertRomanToArabic("MMMCCCXXXI"));
    }

    @Test
    public void whenTheRomanNumberIsMMMCDXL_Then3440() {
        Assertions.assertEquals(3440, Convertor.convertRomanToArabic("MMMCDXL"));
    }

    @Test
    public void whenTheRomanNumberIsMCMLXX_Then1970() {
        Assertions.assertEquals(1970, Convertor.convertRomanToArabic("MCMLXX"));
    }

    @Test
    public void whenTheRomanNumberIsMMMCCCXXXIII_Then3333() {
        Assertions.assertEquals(3333, Convertor.convertRomanToArabic("MMMCCCXXXIII"));
    }

    @Test
    public void whenTheRomanNumberIsMMMMDCCCXC_Then4890() {
        Assertions.assertEquals(4890, Convertor.convertRomanToArabic("MMMMDCCCXC"));
    }

    @Test
    public void whenTheRomanNumberIsMMMCMXCVII_Then3997() {
        Assertions.assertEquals(3997, Convertor.convertRomanToArabic("MMMCMXCVII"));
    }

    @Test
    public void whenTheRomanNumberIsMMMDCCCXII_Then3812() {
        Assertions.assertEquals(3812, Convertor.convertRomanToArabic("MMMDCCCXII"));
    }

    @Test
    public void whenTheRomanNumberIsMMMCMXLVIII_Then3948() {
        Assertions.assertEquals(3948, Convertor.convertRomanToArabic("MMMCMXLVIII"));
    }


    @Test
    public void whenTheRomanNumberIsMMMCMXXXV_Then3935() {
        Assertions.assertEquals(3935, Convertor.convertRomanToArabic("MMMCMXXXV"));
    }


}