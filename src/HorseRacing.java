public class HorseRacing extends Thread{

    public HorseRacing(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i = 1 ; i <=5 ; i++){
            try {
                sleep(1000);
                System.out.println(getName() + "正在跑第" + i +"圈");
            } catch (InterruptedException e) {
                System.out.println("exception");
                e.printStackTrace();
            }
        }
    }
}
