package Java_cource;

import java.util.Scanner;

public class Proj_3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int packageNumber;
        int howManyCourses;
        int baseCost;
        int costPerCourse;
        int numIncluded;
        int totalCost;
        System.out .println("Which of the Packages you want to choose 1 ?,2 ?,3 ? ");
        packageNumber=keyboard.nextInt();
        System.out .println("How many courses did you enroll in a month ");
        howManyCourses=keyboard.nextInt();

        if(packageNumber==1){
            baseCost=10;
            costPerCourse=6;
            numIncluded=2;

        }else if(packageNumber==2){
            baseCost=12;
            costPerCourse=4;
            numIncluded=4;
        }else{
            baseCost=15;
            costPerCourse=3;
            numIncluded=6;
        }

        if(howManyCourses>numIncluded){
            totalCost=(howManyCourses-numIncluded)*baseCost;
        }else{
            totalCost=baseCost;
        }
        System.out.println("Total cost is  : Rs "+totalCost);
    }
}
