package lessan2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyTheard myTheard = new MyTheard();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(myTheard);
            t.setName("Thead " + i);
            t.start();
        }
    }
}
