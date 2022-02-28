import java.util.Arrays;
import java.util.Scanner;

public class Main{
    
    
    public static boolean result = false;
    public static  Scanner sc = new Scanner(System.in);

     public static void main(String []args){
         int[] a = new  int[6];
         int count = countTriples(a);
         System.out.print(count);
          }
          public static int countTriples(int[] array){
              int size = array.length;
              int count = 0;
              int first,second,third;
              // reads from user 
              for (int i=0; i<size; i++){
                  array[i] = sc.nextInt();
              }
              for (int i=0; i<size; i++){
                  //retrieve indexes of the array
                  first = i;
                  second = i+1;
                  third = i+2;
                  int valueOfFirst = array[first] + 1;
                  int valueOfThird = array[second] + 1;
                  if (array[second] == valueOfFirst && array[third] == valueOfThird) count++;
                  if (third == size-1) break; //last element
                  
                  
              }
              return count;
              
          }
          
     
   
         
        
        
    
}
