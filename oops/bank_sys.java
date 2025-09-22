package oops;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
public class bank_sys {
    public static void main(String[] args) {
        
    }
}
//interface for transactions
interface Transactionlogger{
    void logTransaction(Transaction transaction);
}
class Transaction{
    private String trans_id;
    private Date date;
    private String amount;
    
    Transaction(String trans_id,Date date,String amount){
        this.trans_id=trans_id;
        this.date=date;
        this.amount=amount;
    }
    public String gettrans_id(){
        return trans_id;
    }
    public Date getdate(){
        return date;
    }
    public String getamount(){
        return amount;
    }
}

class Account{
    String acc_num;
    String name;
    double balance;
    List<Transaction>transactions;

    Account(String acc_num, String name, double balance){
        this.acc_num=acc_num;
        this.name=name;
        this.balance=balance;
        this.transactions=new ArrayList<>();
        
    }
    public String getacc_num(){
        return acc_num;
    }
    public String getname(){
        return name;
    }
    public double getbalance(){
        return balance;
    }
    public List<Transaction>geTtransactions(){
        return transactions;
    }
}
class SavingAcc extends Account{
    private static final double min_amt=1000;
    public SavingAcc(String acc_num,String name, double balance){
        super(acc_num, name, balance);
    }
    public boolean withdraw(double amount){
    if(balance-amount>=min_amt){
        balance-=amount;
        return true;
    }else{
        System.out.println("cannot withdraw");
        return false;
    }
}
}

class CurrentAcc extends Account{
    public CurrentAcc(String acc_num,String name, double balance){
        super(acc_num, name, balance);
    }
    public boolean withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            return true;
        }else{
            System.out.println("insufficient balance");
            return false;
        }
    }
}
// ___________________________________________________

abstract class ATM implements Transactionlogger{
    protected String location;
    protected String machineid;
    public ATM(String location,String machineid){
        this.location=location;
        this.machineid=machineid;
    }
    public abstract boolean withdraw(Account acc_num,double amount);
    public abstract boolean deposit(Account acc_num,double amount);
    public void logTransaction(Transaction transaction){
        System.out.println("transaction logges"+transaction);
    }

}
class BasicATM extends ATM{
    public BasicATM(String location,String machineid){
        super(location,machineid);
    }
    @Override
    public void withdraw(Account account, double amount){
        boolean success=false;
        if(account instanceof SavingAcc){
            success=((SavingAcc)account).withdraw(amount);
        }else if(account instanceof CurrentAcc){
            success=((CurrentAcc)account).withdraw(amount);
        }
        if(success){
            Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Withdraw");
            account.transactions.add(t);
            logTransaction(t);
        }
    }
    @Override
public void deposit(Account account, double amount) {
account.balance += amount;
Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Deposit");
account.transactions.add(t);
logTransaction(t);
}
}