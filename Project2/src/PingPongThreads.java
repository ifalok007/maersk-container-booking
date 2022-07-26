import java.util.HashMap;
import java.util.concurrent.Semaphore;

public class PingPongThreads {
    public static void main(String[] args) {
        Semaphore obj = new Semaphore(1);
        for(int i=0;i<10;i++){
            new Thread(new PingThread(obj)).start();
            new Thread(new PongThread(obj)).start();
        }
    }
}

class PingThread implements  Runnable {
    Semaphore obj ;

    public PingThread(Semaphore mutex){
        this.obj = mutex;
    }

    @Override
    public void run() {
        try {
            obj.acquire();
            HashMap
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ping");
        obj.release();
    }
}


class PongThread implements Runnable{
    Semaphore obj ;

    public PongThread(Semaphore mutex){
        this.obj = mutex;
    }

    @Override
    public void run() {
        try {
            obj.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("pong");
        obj.release();
    }
}