package Java_cource;

import java.util.ArrayList;

public class Proj_6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);

        int sum=sumElements(list);
        System.out.println(sum);
    }
    public static int sumElements(ArrayList<Integer>list){
        int sum=0;

        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}
