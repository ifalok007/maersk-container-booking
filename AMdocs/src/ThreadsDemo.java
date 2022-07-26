import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsDemo {
    public static void main(String[] args) {

        Runnable i = ()-> {

        };

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        ExecutorService service = Executors.newFixedThreadPool(1);
         service.execute(()-> {
             //code
         });
    }
}

class Thread2 implements Runnable
