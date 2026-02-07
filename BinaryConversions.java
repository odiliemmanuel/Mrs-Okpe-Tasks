package Java.MrsOkpe;

public class BinaryConversions {
    public static void main(String...Odili){

       int binary = conversionToBaseTen("101");
        System.out.println(binary);


//    int result = mathDotPower(2,3);
//
//        System.out.println(result);
    }




    public static int conversionToBinary(int number){

     
           int remainder = 0;
           String result = "";
           int divisor = 0;;
           int base = 2;
           int division = Math.abs(number);
          
          if(number == 0 && division == 0){
             return 0;
          }
        
           while(division > 0){ 

               divisor = division;

               division = division / base;
                
               remainder = divisor % base;
        
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
 




      
    public static int mathDotPower(int numberOne, int numberTwo){

        int result = 1;
    
        for(int count = 0; count < numberTwo; count ++){
            
            result *= numberOne;

          
        }

        return result;
        
    }
    




       

    public static int conversionToBaseTen(String number){

        int divisor = 2;

        int multiplier = 0;

        int result = 0;

        int calculation = 0;

        int[] arrayOfDigits = calculationToGetEachDigit(number);

        for(int count = 0; count <= arrayOfDigits.length - 1; count++){
            
            multiplier = mathDotPower(divisor, arrayOfDigits.length - 1 - count);
           
            calculation = arrayOfDigits[count] * multiplier;

            result += calculation;
    
        }
        
        return result;

    }


















































}
