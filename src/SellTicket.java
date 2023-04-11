public class SellTicket implements Runnable {

    private int ticket = 1000;
    @Override
    public void run() {
        for(int i = 0 ; i < 1000 ; i++){
            synchronized (this) {
                if(ticket > 0){
                try{
                    Thread.sleep(0);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "票剩下" + ticket-- +"張");
            }else {
                System.out.println(Thread.currentThread().getName() + "票已售完");
                break;
                }
            }
        }
    }
}
