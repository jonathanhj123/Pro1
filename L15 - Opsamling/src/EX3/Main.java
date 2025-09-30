package EX3;

public class Main {
    public static void main(String[] args) {



        Account MyAccount = new Account(1122, 20000);

        MyAccount.setAnnualInterestRate(4.5);

        System.out.println(MyAccount.getMonthlyInterestRate() );
        System.out.println(MyAccount.getMonthlyInterest());

        MyAccount.Withdraw(2500);
        System.out.println(MyAccount.getBalance());
        MyAccount.Deposit(3000);
        System.out.println(MyAccount.getBalance());

        System.out.println("The account was created on: " + MyAccount.getDateCreated());
    }
}
