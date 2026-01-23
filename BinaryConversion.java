package java.MrsOkpe;

import java.util.Arrays;
import Estee.Swapping;


public class BinaryConversion {
    public static void main(String...Odili){

//       int [] binary = conversionToBaseTen("1010");
//        System.out.println(Arrays.toString(binary));
//

    int result = powerTest(4,3);

        System.out.println(result);
    }




    public static int conversionToBinary(int number){

     
           int remainder = 0;
           String result = "";
           int divisor = 2;
           int division = Math.abs(number);
          
          if(number == 0 && division == 0){
             return 0;
          }
        
           while(division > 0){ 

               divisor = division;

               division = division / 2;
                
               remainder = divisor % 2;
        
               result = remainder + result;                  
                
            }
           
       
             int finalResult = Integer.parseInt(result);

        return finalResult;

    }





    public static int[] calculationToGetEachDigit(String number){

        String[] digits = number.split("");
        int[]arrayOfDigits = new int[number.length()];


        int convert = 0;


        for(int count = 0; count < arrayOfDigits.length; count ++){
       
            convert = Integer.parseInt(digits[count]); 

            arrayOfDigits[count] = convert;
        }
           


        return arrayOfDigits;
    
   }


        public static int powerTest(int number, int num){

          int result = Swapping.mathDotPowerFunction(number,num);

            return result;
        }

    

//    public static int conversionToBaseTen(String number){
//
//        int divisor = 2;
//
//        int[] arrayOfDigits = calculationToGetEachDigit(number);
//
//        for(int count = arrayOfDigits.length - 1; count >= 0; count --){
//            
//            
//        }
//        
//    }
//
//
















































}
