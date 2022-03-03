package Java_cource;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proj_4_2_ArrayList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double input;
        ArrayList<Double> myList = new ArrayList<>();
        System.out.println("Enter 0 or  more to put in the list or -1 to exit");
        input = keyboard.nextDouble();
        while(input>=0){
            myList.add(input);
            System.out.println("Enter 0 or  more to put in the list or -1 to exit");
            input =keyboard.nextDouble();
        }
        for(int i =myList.size()-1;i>=0;i--){
            System.out.println(myList.get(i));
        }
    }
}
