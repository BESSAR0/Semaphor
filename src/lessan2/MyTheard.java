package lessan2;

public class MyTheard extends Thread {
    public void run() {
        int x = 50;
        for (int i = 0; i < 10; i++) {
            x--;
            System.out.println(x);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }

    }
}
