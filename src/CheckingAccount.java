public class CheckingAccount{
    private String name;
    private int balance;
    private String id;
    private double interestRate;

    public CheckingAccount(String inputName, int inputBalance, String inputId){
        name = inputName;
        balance = inputBalance;
        id = inputId;
        this.interestRate = 0.02;
    }

    //Write new methods here:
    public int getBalance(){
        return balance;
    }

    public void setBalance(int newBalance){
        balance = newBalance;
    }

    public double getMonthlyInterest(){
        return this.interestRate * this.balance;
    }
}