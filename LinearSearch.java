
package linearsearch;

import java.util.Scanner;
import java.util.Random;

public class LinearSearch {

    
    public static void main(String[] args) {
     int i , size ,search, array[];
        int find_index=-1;

     
     Scanner input = new Scanner (System.in);
     
     Random rand= new Random();
     System.out.print("Enter Array size : ");
     size = input.nextInt();
     array = new int[size];
     
      System.out.print("Enter number to find : ");
      search= input.nextInt();
   
     
     for (i = 0; i < size; i++){
         array[i] = rand.nextInt(2000);
         
          System.out.println("\t\t\t\t\t Array[" + i + "] = " + array[i]);

         
       for(int j=0; j<array.length ;j++)
       {
          if(array[j]==size)
          {
             find_index=j;

             break;
          }
       }
                 
         
    }
      if(find_index!=1)
       {
          System.out.println(" FOUND: " + search + " is at " + "array[" +i+ "]");
         
       }

       else
          System.out.println("\n not found in the array.");
  
    }
    
}
     
     
