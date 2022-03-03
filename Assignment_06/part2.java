package Assignment_06;

public class part2 {
    public part2(){
        System.out.println("constructor one is running");
    }
    public part2(String s){
        this();
        System.out.println(s);
    }

    public static void main(String[] args) {
        part2 obj = new part2("vishal");

    }
}
