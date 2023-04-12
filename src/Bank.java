public class Bank {
    private int balance = 10000;
    private int withdrawAmount;

    public synchronized void withdraw(int amount) {
        System.out.println("目前餘額：" + balance);
        withdrawAmount = amount;
        System.out.println("取款: " + amount);
        while (balance < amount) {
            System.out.println("你沒錢了，請存款");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        balance -= amount;
        System.out.println("取款: " + amount +" 完成");
        System.out.println("餘額：" + balance);
    }

    public synchronized void deposit(int amount) {

        System.out.println("存款: "+ amount);
        while (true) {
            if (balance < withdrawAmount) {
                balance += amount;
            }else {
                notify();
                break;
            }
            System.out.println("目前餘額：" + balance);
            System.out.println("存款完成 ");
//            notify();
        }
    }
}

