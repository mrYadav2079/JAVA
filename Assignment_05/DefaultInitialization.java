package Assignment_05;

public class DefaultInitialization {
    public static void main(String[] args) {
        Vishal p=new Vishal();
        p.print();
        //p.printLocal();
        System.out.println();
        Singleton s=new Singleton();
        s.getEmail();
    }
}
class Singleton{
    String email;

    public static Singleton setEmail(String email) {
        //    this.email = email;
        return new Singleton();
    }

    public void getEmail() {
        System.out.println(this.email);
    }
}
class Vishal{
    Character gender;
    int age;
    public void print(){
        System.out.print(this.age+" "+this.gender);
    }
//    public void printLocal(){
//     int height ;
//        int weight;
//        System.out.println(height+" "+weight);
//    }
    //we cannot print local variables without initializing them;
}
