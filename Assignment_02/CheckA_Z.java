package Assignment_02;

import java.util.HashSet;
import java.util.Scanner;

public class CheckA_Z {
    public static void Check(String str){
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<str.length();i++){
            int ascii = (int)str.charAt(i);
            if(ascii >=97 && ascii<=122){
                h.add(str.charAt(i));
            }
        }
        System.out.println( h.size()==26);
    }

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scn.nextLine();
        Check(str);

    }
}
