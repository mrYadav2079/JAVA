package Java_cource.Proj_Bank_Account;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount =new BankAccount("Vishal",6000);
        BankAccount pulkitAccount =new BankAccount("Pulkit");
        pulkitAccount.deposit(1000);

        System.out.println("Owner : "+pulkitAccount.getOwner());
        System.out.println("Balance : "+pulkitAccount.getBalance());

        pulkitAccount.withdraw(2000);// WARNING!!!

        System.out.println("Owner : "+pulkitAccount.getOwner());
        System.out.println("Balance : "+pulkitAccount.getBalance());
        System.out.println();

        System.out.println("Owner : "+myAccount.getOwner());
        System.out.println("Balance : "+myAccount.getBalance());
        System.out.println();

        System.out.println("Deposit 1000 ? ");
        myAccount.deposit(1000);
        System.out.println("Owner : "+myAccount.getOwner());
        System.out.println("Balance : "+myAccount.getBalance());


    }
}
