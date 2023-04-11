public class Bank {
    int balance = 10000;
    public synchronized void withdraw(int amount){
        System.out.println("取款");
        while(balance < amount){
            System.out.println("目前餘額：" + balance);
            System.out.println("你沒錢了，請存款");
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        balance -= amount;
        System.out.println("取款完成");
    }
    public synchronized void deposit(int amount){
        System.out.println("存款");
        balance += amount;
        System.out.println("目前餘額：" + balance);
        System.out.println("存款完成");
        notify();
    }
}
