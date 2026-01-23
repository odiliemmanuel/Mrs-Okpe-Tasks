import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BinaryConversionTest{



    @Test
    public void testThatMethodReturnsTheResultInReverse(){

        int actual = BinaryConversion.conversionToBinary(10);

        int expected = 1010;

        Assertions.assertEquals(actual,expected);
    }



    @Test
    public void testThatWhenInputIsNegativeItreturnsOriginalValue(){

        int actual = BinaryConversion.conversionToBinary(-10);

        int expected = 1010;

        Assertions.assertEquals(actual,expected);
    }



    @Test
    public void testThatWhenInputIsZeroResultIsZero(){

        int actual = BinaryConversion.conversionToBinary(0);

        int expected = 0;

        Assertions.assertEquals(actual,expected);
    }





    @Test
    public void testThatMyMethodExists(){
        
        Assertions.assertNotNull(BinaryConversion.conversionToBinary(10));
    }




    @Test
    public void testThatMethodsCalculationWorksForReasonableLengthsOfNumbers(){

        int actual = BinaryConversion.conversionToBinary(200);

        int expected = 11001000;

        Assertions.assertEquals(actual,expected);

    }



    

























}
