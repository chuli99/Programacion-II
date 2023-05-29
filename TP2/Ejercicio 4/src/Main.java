
import Hilos.HiloCallable;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.ejecutar();
    }

    public void ejecutar() {
        ExecutorService exService = Executors.newFixedThreadPool(4);

        for(int i = 0; i < 4; i++) {
            Random generadorDeNum = new Random();
            exService.submit(new HiloCallable(String.format("HiloCallable%s", i + 1),
                    10 + generadorDeNum.nextInt(30),
                    50 + generadorDeNum.nextInt(949)));
        }

        exService.shutdown();
    }
}