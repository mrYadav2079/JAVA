package Java_cource;

import java.util.Scanner;

public class Proj_4_1_Arrays {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int[] someValues = new int[5];

       for(int i=0;i<someValues.length;i++){
           System.out.print("Enter an Integer\t");
                someValues[i]= keyboard.nextInt();
       }
       for(int i=0;i<someValues.length;i++){
           System.out.println("result is :"+someValues[i]*2);
       }

    }

}
