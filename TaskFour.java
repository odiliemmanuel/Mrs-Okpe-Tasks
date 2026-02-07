package Java.MrsOkpe;

import java.util.Arrays;
public class TaskFour{
   public static void main(String...Odili){

        int [] value = {2,3,5,10,4};

        int [] result = squareValues(value);

         System.out.println(Arrays.toString(result));
   }



    public static int[] squareValues(int[] numbers){

        int [] values = arrangeToAscendingOrder(numbers);
        int [] value = new int[numbers.length];

        for(int count = 0; count < numbers.length; count ++){

            for(int index = 0; index < numbers.length - 1; index ++){
                
                value[count] = values[count] * values[count];
                

                }
            }

             return value;
        }

       
    

    public static int[] arrangeToAscendingOrder(int[] numbers){

        int[] value = (numbers);

        for(int count = 0; count < value.length; count ++){

            for(int index = 0; index < value.length - 1; index ++){
                 

                if(value[index] > value[count]){

                    int swap = value[index];
                    value[index] = value[count];
                    value[count] = swap;
                   
                }
                 
                   
           }
             
        }

            
       return value;             
  }








}
