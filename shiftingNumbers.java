import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld{
    
    
    public static boolean result = false;
    public static  Scanner sc = new Scanner(System.in);

     public static void main(String []args){
         int[] ar = new int[5];
            shiftingNumbers(ar);
       
          }
          public static void shiftingNumbers(int[] array){
            int size = array.length;
            //reads from user input
            for (int i = 0; i<size; i++){
                array[i] = sc.nextInt();
            }
              int tempLast = array[size-1];
              int tempFirst = array[0];
            
            array[size-1] = tempFirst;
            array[0]      = tempLast;
            int tmp;
            for (int i = 1; i<size; i++){
                if (i+1 == size) break;
                array[i] = array[i+1];
                tmp = array[i+1];
                array[i+1] = tmp;
             
            }
            System.out.print(Arrays.toString(array));
            
          }
   
}
