import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EquationClass eq = new EquationClass();
        level1 l1 = new level1();
        int correct = 0;
        int level1Streak = 0;
       printIntro();
        String name = scan.nextLine();
        String originalName = eq.getName();
        eq.setName(name);
        System.out.println();
        System.out.println("Nice to meet you " + eq.getName() + "!");
        System.out.println("Player stats: ");
        System.out.println("Health bar: " + eq.getName());
        int life = eq.getName().length();
        while (life != 0) {
            System.out.println("Equations correct: " + correct);
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
                correct++;
                level1Streak++;
            }
            if (!l1.correct) {
                eq.removeLetter();
                System.out.println("NEW NAME: " + eq.getName());
                life--;
            }
            if (level1Streak == 3) {
                break;
            }

        }
        System.out.println("GAME OVER!");
        System.out.print("Thanks for playing " + name);
    }
    public static void printIntro()
    {
        System.out.println("|-----------------------|");
        System.out.println("|Welcome to LifeEquation|");
        System.out.println("|-----------------------|");
        System.out.println("|--------------------------------------------|");
        System.out.println("|Your name is your health!                   |");
        System.out.println("|You lose a letter for each incorrect answer!|");
        System.out.println("|once you get three right, it gets harder!   |");
        System.out.println("|--------------------------------------------|");
        System.out.print("Please enter your name: ");
    }
}
