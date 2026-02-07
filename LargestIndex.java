package Java.MrsOkpe;

public class LargestIndex{
    public static void main(String...Odili){

        int [] []array = { {2,3,4,6,7}, {5,6,5}, };


       int result = largestTotal(array);

        System.out.println(result);

    }



    public static int[] sumArray(int[][] array){
        
            int[] total = new int[array.length];
    
        for(int row = 0; row < array.length; row ++){

           for(int column = 0; column < array[row].length; column ++){

                total[row] += array [row][column];
               
           }
        
        }
        
        return total;

    }





    public static int largestTotal(int[][] array){

        int [] total = sumArray(array);

            int largest = total[0];
            
            for(int count = 0; count < total.length; count ++){
                if(total[count] > largest){
                    largest = total[count];
                }
                        
              }

            return largest;

     }





















}
