public class BinaryConversion {
    public static void main(String...Odili){

      int binary = conversionToBinary(10);
        System.out.print(binary);

    }




    public static int conversionToBinary(int division){

     
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

    //           System.out.print(remainder + "\n");
        
               result = remainder + result;                  
                
            }
           
       
             int finalResult = Integer.parseInt(result);

        return finalResult;

    }






    public static int conversionToBaseTen(String number){

         
    }
    


    

















}
