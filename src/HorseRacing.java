public class HorseRacing extends Thread{

    public HorseRacing(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i = 1 ; i <=5 ; i++){
            System.out.println(getName() + "正在跑第" + i +"圈");
        }
    }
}
