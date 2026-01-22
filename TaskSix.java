import java.util.Arrays;
public class TaskSix {
    public static void main(String...Odili){

    int [][] numbers = {{5, 6},
                        {7, 2},
                        {3, 9}};

       
       int[][] largestAndSmallest = smallestAndLargestRowAndIndex(numbers);

        System.out.println(Arrays.deepToString(largestAndSmallest));
        
        
    }



    public static int[] largestRowAndColumn(int[][] numbers){
       
        int largest = numbers[0][0];
        int largestRow = 0;
        int largestColumn = 0;

        int[] largestArray = new int[2];

        for(int row = 0; row < numbers.length; row ++){
            for(int column = 0; column < numbers[row].length; column ++){

                if(numbers[row][column] > largest){
                    largest = numbers[row][column];
                    largestRow = row;
                    largestColumn = column;
        

                    largestArray[0] = largestRow;
                    largestArray[1] = largestColumn;
                }
                    
                  
            }

            
        }
           

//        System.out.println(largestRow);
//        System.out.println(largestColumn);
           
      return largestArray;
    }





     public static int[] smallestRowAndColumn(int[][] numbers){
       
        int smallest = numbers[0][0];
        int smallestRow = 0;
        int smallestColumn = 0;

        int[] smallestArray = new int[2];

        for(int row = 0; row < numbers.length; row ++){
            for(int column = 0; column < numbers[row].length; column ++){

                if(numbers[row][column] < smallest){
                    smallest = numbers[row][column];
                    smallestRow = row;
                    smallestColumn = column;
        

                    smallestArray[0] = smallestRow;
                    smallestArray[1] = smallestColumn;
                }
                    
                  
            }

            
        }
           
//
//        System.out.println(smallestRow);
//        System.out.println(smallestColumn);
           
      return smallestArray;
    }



    public static int[][] smallestAndLargestRowAndIndex(int[][] numbers){

        int [] smallest = smallestRowAndColumn(numbers);

        int [] largest = largestRowAndColumn(numbers);

        int [][] largestAndSmallestIndexes = {smallest, largest};


        return largestAndSmallestIndexes;
    }



















}
