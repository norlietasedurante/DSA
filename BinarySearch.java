
package binary.search;


import java.util.Random;
import java.util.Scanner;


public class BinarySearch {
    private static int x;

   
    public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in);
         Random  nory = new Random();

    int c, left, right, middle, size, n,  search, array[],table =0;
    int find_index=-1;
   
    System.out.print("Enter number of elements:");
    size = input.nextInt(); 
    array = new int[size];
 
     System.out.println();
     
     System.out.println( size + " Random number to be generated  ");
    
         
         for ( int x = 0; x< size; x++){
             array[x] = nory.nextInt(1000);
              System.out.print(array[x] + "\t");
             table+=1;
             
             if(table==10){
             System.out.println("");
             table=0;
             }
         }
         
         
         
         for ( int x = 0; x <size-1; x++){
             for  (int y= 0 ; y< size-x-1; y++){
                if (array[y] > array [y+1]){
                  int swap = array [y];
                  array[y] = array [y+1];
                  array [y+1] = swap;
                  
              }
         }
                 
         }
 
    System.out.println();
 
            System.out.print("Enter value to find: ");
                    search = input.nextInt();
 
    left  = 0;
    right  = 0;
    middle = (left+ right)/2;
 
            while( left <= right ){
                   middle = (left + right)/2;
        
                if ( array[middle] < search )
                    left = middle + 1; 
      
                else if ( array[middle] == search ) {
                    System.out.println();
                
            
          
      }
                else
                 right = middle - 1;
 
    
   }
         System.out.println();
    
          
       
        for(int j=0; j<size-1 ;j++)
       {
          if(array[j]==array[middle])
          {
             find_index=j;

             break;
          }
       
                 
      if(find_index == search -1)
       {
        
          System.out.println(" FOUND: " + search + " is at " + "array[" + find_index + "]");
         
       }

       else
          System.out.println("\n not found in the array.");
  
    }
    }
}
  
    


