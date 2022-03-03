package Java_cource;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj_5_1_NamePermutation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fullName;
        String lastName;
        String firstName;
        int indexOfSpace;
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        final int NoOfNames=5;
        for(int i=0;i<NoOfNames;i++){
            System.out.println("Enter name "+ i+"\t");
            fullName =keyboard.nextLine();
            indexOfSpace=fullName.indexOf(' ');
            firstName=fullName.substring(0,indexOfSpace);
            lastName=fullName.substring(indexOfSpace+1);
            firstNames.add(firstName);
            lastNames.add(lastName);
        }
        for(int i=0;i<NoOfNames;i++){
            for(int j =0;j<NoOfNames;j++){
                System.out.println(firstNames.get(i)+" "+lastNames.get(j));
            }
        }
    }
}
