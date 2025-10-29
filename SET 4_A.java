class Account{
    private int balance = 1000;
    public synchronized void withdraw(String name,int amount){
        if(balance >= amount){
            System.out.println(name +" is trying to withdraw "+amount);
             try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;
            System.out.println(name + " completed withdrawal of " + amount + 
                               ". Remaining balance: " + balance);
        } else {
            System.out.println(name + " tried to withdraw " + amount + 
                               " but not enough balance! Current balance: " + balance);
        }
    }
}
    

class Customer implements Runnable{
    private Account acc;
    private String name;
    private int amount;
    Customer( Account acc, String name, int amount){
        this.acc = acc;
        this.name =name;
        this.amount=amount;
    }
    public void run(){
        acc.withdraw(name,amount);
    }
}
public class Banktest{
    public static void main(String []args){
        Account account = new Account();
        Thread t1=new Thread(new Customer(account,"customer1",700));
        Thread t2= new Thread(new Customer(account,"customer2",500));
        t1.start();
        t2.start();
    }
}
