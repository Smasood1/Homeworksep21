package sep20hw;

public class Account {

    private double balance;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0){
           this.balance = balance;
        }
    }




    /*Create a class named Account
Give it one instance variable - balance
Create a getter and a setter
Make sure that one cannot set the balance of the account class to a negative number
Create an Account object in main
Attempt to set the balance to a negative balance
Then use your getter to get the balance and print it out
*/



}
