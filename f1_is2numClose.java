import java.util.Scanner;
import java.util.Arrays;

class Main {
     
    public static boolean result = false;
    public static  Scanner sc = new Scanner(System.in);

     public static void main(String []args){
         boolean  res = isClose(2,3,3);
         System.out.println(res);
          }
     
     public static boolean isClose(int m, int n, int size){
         int[] integers = new int[size];
         
         
         //read from user input
         for (int i=0; i<integers.length; i++){
             integers[i] = sc.nextInt();
             
             
         }
         // m and n  next to each other  --> true : false
         for (int i= 0 ; i<integers.length; i++){
            if (i+1 == integers.length) break;
              if ( (integers[i] == m && integers[i+1] == n) || (integers[i] == n && integers[i+1] ==m ) ){
                  result = true;
                  break;
              }
         }
             return result;
      
         }
         
        
        
    
}
