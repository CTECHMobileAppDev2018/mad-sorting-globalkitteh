import java.util.Arrays;
import java.util.Random;

class Sort { 

    // start and end are optional - some sorting algorithms use them, but you can ignore them
    void sort(double arr[], long start, long end) 
    {
      double initArr[] = arr;
      for(int x=0; x <= (arr.length-1); x++){
        System.out.println(arr[x]);
        
        double tempNum;
        double tempNum2;
        for (int numLoop = 0; numLoop < (((end * end) + 1) / 2); numLoop++){
          for (int i = 0; i < (end-1); i++) {
            
            tempNum = arr[i];
            tempNum2 = arr[i+1];
            
            if(tempNum > tempNum2){
              
              arr[i+1] = tempNum;
              arr[i] = tempNum2;
            }
          }
        }
      }
        //GO BOGO
        //Currently non-functional BOGOsort, have to implement check for correctness, and fix random array randomizer.
      boolean doneBOGO = false;
      Random rand = new Random();
      double arrBOGO[] = initArr;
      double tempNum;
      double tempNum2;
      
      while (doneBOGO = false){
        for (int i = 0; i < (end-1); i++) {
          tempNum = arrBOGO[i];
          tempNum2 = arrBOGO[i+1];
          
          int randOutput = rand.nextInt(10);
          
          if(randOutput >= 5){
            arrBOGO[i+1] = tempNum;
            arrBOGO[i] = tempNum2;
            }
        }
        System.out.println(arrBOGO);
        if(arrBOGO == arr) {
          doneBOGO = true;
        }
      }
    } 
  
    // Test program 
    public static void main(String args[]) 
    { 
        double arr[] = {10.0, 7.1, 8.6, 9.9, 1.8, 5.0}; 
        System.out.println("original array: "); 
        System.out.println(Arrays.toString(arr));
        
        // create a sorted version to test.
        double sortedArr[] = arr.clone();
        Arrays.sort(sortedArr);
        System.out.println("sorted array: "); 
        System.out.println(Arrays.toString(sortedArr));
        
       
        Sort sorter = new Sort(); // create a sorter object
        sorter.sort(arr, 0, arr.length); // call the sort function
  
        System.out.println("*** your sorted array: "); 
        System.out.println(Arrays.toString(arr));
    } 
} 
