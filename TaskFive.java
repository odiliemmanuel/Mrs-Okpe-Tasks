import java.util.Arrays;
public class TaskFive {
    public static void main(String...Odili){

    int [][] numbers = {{5, 6},
                        {7, 1},
                        {3, 2}};

        int[] total = sumValues(numbers);
            
               System.out.print(Arrays.toString(total));
           
        
    }



    public static int[] sortedValues(int[][] numbers){

       int [] total = new int[numbers.length];

        for(int row = 0; row < numbers.length; row ++){
            for(int column = 0; column < numbers[row].length; column ++){

                total[row] += numbers[row][column];   

            }
        }  
  

        return total;
    }
    



    public static int[] sumValues(int[][] numbers){
        
        int [] total = sortedValues(numbers);

        for(int count = 0; count < total.length; count ++){
            for(int index = 0; index < total.length; index ++){

                if(total[index] > total[count]){ 

                    int swap = total[count];
                    total[count] = total[index];
                    total[index] = swap; 

                }
            }
        }

        return total;
            
        
    }












}
