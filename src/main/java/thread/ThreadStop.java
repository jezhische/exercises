package thread;

/**
 * Created by WORK_x64 on 21.03.2017.
 */
public class ThreadStop extends Thread {
//    @Override
//    public final void stop() {} // deprecated and final
    private boolean flag;
    public int count;
    public ThreadStop() {
        flag = true;
    }
    @Override
    public void run() {
        while (flag) {
            count++;
            try {  // почему не останавливается, если не поспит?
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void terminate() {
        flag = false;
    }

    public static void main(String[] args) throws InterruptedException {
//        Thread.currentThread().stop(); // deprecated
        System.out.println("main started");
        ThreadStop ts = new ThreadStop();
        ts.start();
        Thread.sleep(2000);
        ts.terminate();
        ts.join(); // зачем это?
        System.out.printf("count = %d. ts is dead, main terminates", ts.count);
    }
}
