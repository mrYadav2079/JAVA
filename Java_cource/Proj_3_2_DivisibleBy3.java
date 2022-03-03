package Java_cource;

import java.util.Scanner;

public class Proj_3_2_DivisibleBy3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("Please enter the integer");
        number=keyboard.nextInt();

        if(number %3==0){
            System.out.println("the number"+number+" is divisible by 3");
        }else{
            System.out.println("the number  "+number+" is NOT  divisible by 3");
        }
    }
}
