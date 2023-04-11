public class Day0411 {
    public static void main(String[] args) {
        MultiThread t = new MultiThread();
        t.start();
        System.out.println("列出預設執行緒名稱：" + t.getName());
    }
}
