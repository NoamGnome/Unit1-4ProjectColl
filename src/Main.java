import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EquationClass eq = new EquationClass();
        System.out.println("|-----------------------|");
        System.out.println("|Welcome to LifeEquation|");
        System.out.println("|-----------------------|");
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        eq.setName(name);
        System.out.println("Nice to meet you " + eq.getName() + "!");
        System.out.println("Player stats: ");
        System.out.println("Health bar: " + eq.getName());
        System.out.println("Equations correct: 0");
    }
}