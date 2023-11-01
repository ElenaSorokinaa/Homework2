package Homework2.AddHomeworks.Third;

public class Set {
    public static void main(String[] args) {
        Cat begemot = new Cat("begemot");
        System.out.println("Раньше кота звали " + begemot.getName());
        begemot.setName("begemotik");
        System.out.println("Теперь он " + begemot.getName());
    }
}