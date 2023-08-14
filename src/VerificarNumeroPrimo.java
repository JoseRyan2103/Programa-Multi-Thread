import java.util.ArrayList;
import java.util.List;
public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            numeros.add(Integer.parseInt(args[i]));
        }

        List<Thread> threads = new ArrayList<>();

        for (int numero : numeros) {
            Thread thread = new Thread(new VerificarPrimoRunnable(numero));
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}