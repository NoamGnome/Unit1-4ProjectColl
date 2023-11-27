import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EquationClass eq = new EquationClass();
        level1 l1 = new level1();
        System.out.println("|-----------------------|");
        System.out.println("|Welcome to LifeEquation|");
        System.out.println("|-----------------------|");
        System.out.println("|--------------------------------------------|");
        System.out.println("|Your name is your health!                   |");
        System.out.println("|You lose a letter for each incorrect answer!|");
        System.out.println("|It gets harder as you get them right!       |");
        System.out.println("|--------------------------------------------|");
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        eq.setName(name);
        System.out.println();
        System.out.println("Nice to meet you " + eq.getName() + "!");
        System.out.println("Player stats: ");
        System.out.println("Health bar: " + eq.getName());
        System.out.println("Equations correct: 0");
        int life = eq.getName().length();
        while (life != 0) {
            int random = l1.random();
            System.out.println(l1.chooser(random));
            System.out.print("What is x: ");
            String answer = scan.nextLine();
            l1.checkAnswer(answer);
            if (l1.correct) {
                System.out.print("Please enter a letter to your name: ");
                String letter = scan.nextLine();
                eq.addLetter(letter);
                System.out.println(eq.getName());
                life++;
            }
            if (!l1.correct) {
                eq.removeLetter();
                System.out.println("NEW NAME: " + eq.getName());
                life--;
            }
        }
        System.out.print("GAME OVER");
    }
}
