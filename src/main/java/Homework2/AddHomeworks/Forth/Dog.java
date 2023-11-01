package Homework2.AddHomeworks.Forth;

public class Dog implements Runnable {
    @Override
    public void run() {
        System.out.println("Собака бежит");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
    }
}