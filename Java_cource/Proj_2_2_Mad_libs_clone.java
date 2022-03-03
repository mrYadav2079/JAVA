package Java_cource;
import java.util.Scanner;
public class Proj_2_2_Mad_libs_clone {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String adjective1;
        String girlsName;
        String adjective2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;

        System.out.println("Enter an adjective");
        adjective1=sc.nextLine();

        System.out.println("Enter a girls's name");
        girlsName=sc.nextLine();

        System.out.println("Enter another adjective");
        adjective2=sc.nextLine();

        System.out.println("Enter an occupation");
        occupation1=sc.nextLine();

        System.out.println("Enter a place name");
        placeName=sc.nextLine();

        System.out.println("Enter a cloth");
        clothing=sc.nextLine();

        System.out.println("Enter a hobby");
        hobby=sc.nextLine();

        System.out.println("Enter another adjective");
        adjective3=sc.nextLine();

        System.out.println("Enter another occupation");
        occupation2=sc.nextLine();

        System.out.println("Enter a boy name");
        boysName=sc.nextLine();

        System.out.println("Enter a mans name");
        mansName=sc.nextLine();

        System.out.println(" There was a girl "+adjective1+" girl named "+girlsName+" who was a "+adjective2+" "+occupation1
                +" in the kingdom of "+placeName+".");
        System.out.println(" She loved to wear "+clothing+" and to "+hobby+". She wanted to marry"+adjective3+" "+occupation2
                +" named "+boysName+" but her father king, "+mansName+" forbid her from seeing him ");

    }
}
