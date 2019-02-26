import java.util.Arrays;
import java.util.Random;

class Sort { 
  
  double correctSort[];
  
  // start and end are optional - some sorting algorithms use them, but you can ignore them
  void sort(double arr[], long start, long end) 
  {
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
    correctSort = arr;
  }
  
  void sortBOGO(double arrBOGO[], long start, long end)
  {
    
    //GO BOGO
    double initArr[] = arrBOGO;
    boolean doneBOGO = false;
    Random rand = new Random();
    double tempNum;
    double tempNum2;
    
    System.out.println("Initial BOGO");
    System.out.println(Arrays.toString(arrBOGO));      
    System.out.println("Correct sort");
    System.out.println(Arrays.toString(correctSort));   
    
    while(doneBOGO == false){ //loop bogo until it succeeds
      for (int i = 0; i < (end-1); i++) {
        tempNum = arrBOGO[i];
        tempNum2 = arrBOGO[i+1]; //sets temps for switching purposes
        
        int randOutput = rand.nextInt(10); //creates random int between 0 and 10
        
        if(randOutput >= 5){
          arrBOGO[i+1] = tempNum; //if random is above or equal to 5, switch the two numbers
          arrBOGO[i] = tempNum2;
        }
      }
      //System.out.println(Arrays.toString(arrBOGO)); // commented out because causes lag, slows down BOGOing
      if(arrBOGO == correctSort) { //if the generated array matches the correct sort, it ends
        doneBOGO = true;
        System.out.println("BOGO SUCCESSFUL");
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
    
    double bubbleArr[] = arr.clone();
    
    Sort sorter = new Sort(); // create a sorter object
    sorter.sort(bubbleArr, 0, bubbleArr.length); // call the sort function
    
    sorter.sortBOGO(arr, 0, arr.length); // call the BOGOsort function
    System.out.println("*** your sorted array: "); 
    System.out.println(Arrays.toString(arr));
  } 
} 
