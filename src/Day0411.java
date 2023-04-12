import java.util.Scanner;

public class Day0411 {   //執行緒
    //    public static void main(String[] args) {
//        MultiThread t = new MultiThread();
//        t.start();
//        System.out.println("列出預設執行緒名稱：" + t.getName());
//    }
//}
//    public static void main(String[] args) {
//    HorseRacing2 t1 = new HorseRacing2("Cat");
//    HorseRacing2 t2 = new HorseRacing2("Dog");
//    Thread a = new Thread(t1);
//    Thread b = new Thread(t2);
//    a.start();
//    b.start();
//    }
//}
//    public static void main(String[] args) {
//        HorseRacing t1 = new HorseRacing("Cat");
//        HorseRacing t2 = new HorseRacing("Dog");
//        t1.start();
//        t2.start();
//    }
//}
//    public static void main(String[] args) {
//        SellTicket s = new SellTicket();
//        Thread t1 = new Thread(s,"機器A");
//        Thread t2 = new Thread(s,"機器B");
//        t1.start();
//        t2.start();
//    }
//}
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank();
        Thread t1 = new Thread() {
            public void run() {
                bank.withdraw(20000);
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                bank.deposit(500);
                }
            };
            t2.start();
    }
}


