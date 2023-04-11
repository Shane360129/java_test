public class Day0411 {   //執行緒
//    public static void main(String[] args) {
//        MultiThread t = new MultiThread();
//        t.start();
//        System.out.println("列出預設執行緒名稱：" + t.getName());
//    }
//}
    public static void main(String[] args) {
    HorseRacing2 t1 = new HorseRacing2("Cat");
    HorseRacing2 t2 = new HorseRacing2("Dog");
    Thread a = new Thread(t1);
    Thread b = new Thread(t2);
    a.start();
    b.start();
    }
}
