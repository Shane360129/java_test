public class HorseRacing2  implements Runnable {

    private String name;

    public HorseRacing2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(this.name + "正在跑第" + i + "圈");
        }
    }
}
