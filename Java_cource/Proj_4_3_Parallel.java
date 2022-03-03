package Java_cource;

import java.util.Scanner;

public class Proj_4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String [] names = new String[5];
        int[] ages = new int[5];
        String name;
        int age;
        for(int i=0;i<names.length;i++){
            System.out.print("Enter a name:");
            name=keyboard.nextLine();

            System.out.print("Enter a age:");
            age=keyboard.nextInt();
            keyboard.nextLine();
            names[i]=name;
            ages[i]=age;
            System.out.println();
        }
        for(int i=0;i<names.length;i++){
            System.out.println(names[i] +" is "+ ages[i]+" years old");
        }
    }
}
