package lesson6;
public class NumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000); // 2 saniyə gözləyir
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();
        printer.start();
    }
}
