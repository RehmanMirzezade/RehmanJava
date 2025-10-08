package lesson1;


public class Person implements Eateble, Runable {

    @Override
    public void eat(String food) {
        System.out.println("Yemək yeyir: " + food);
    }

    @Override
    public int run(int number) {
        return number * 20;  
    }
}