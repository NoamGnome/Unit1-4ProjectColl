import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Name eq = new Name();
        Level1 l1 = new Level1();
        Level2 l2 = new Level2();
        Level3 l3 = new Level3();
        l1.populate();
        l2.populate();
        l3.populate();
        int addLetter = 0;
        int correct = 0;
        System.out.println("|-----------------------|");
        System.out.println("|Welcome to LifeEquation|");
        System.out.println("|-----------------------|");
        System.out.println("|--------------------------------------------|");
        System.out.println("|Your name is your health, max health is 8!  |");
        System.out.println("|You may add up to 3 letters to your name    |");
        System.out.println("|You lose a letter for each incorrect answer!|");
        System.out.println("|once you get three right, it gets harder!   |");
        System.out.println("|Get 8 points and you win!                   |");
        System.out.println("|--------------------------------------------|");
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        if (name.length() < 9) {
            eq.setName(name);
        }
        while (!(name.length() < 9)) {
            System.out.print("Enter a name 8 characters or less: ");
            name = scan.nextLine();
            eq.setName(name);
        }
        System.out.println();
        System.out.println("Nice to meet you " + eq.getName() + "!");
        System.out.println("Player stats: ");
        System.out.println("Health bar: " + eq.getName());
        int life = eq.getName().length();
        while (life != 0) {
            if (correct < 3) {
                life = eq.getName().length();
                System.out.println("points: " + correct);
                int random1 = l1.random();
                System.out.println(l1.chooser(random1));
                System.out.print("What is x: ");
                String answer1 = scan.nextLine();
                l1.checkAnswer(answer1);
                if (l1.correct) {
                    if (addLetter != 3 && name.length() < 8) {
                        System.out.print("Please enter a letter to your name: ");
                        String letter = scan.nextLine();
                        eq.addLetter(letter);
                        addLetter++;
                    }
                    System.out.println("Health: " + eq.getName());
                    life++;
                    correct++;
                }
                if (!l1.correct) {
                    eq.removeLetter();
                    System.out.println("Health: " + eq.getName());
                    life--;
                    correct--;
                }
            }
            if (correct < 6 && correct > 2) {
                life = eq.getName().length();
                System.out.println("points: " + correct);
                int random2 = l2.random();
                System.out.println(l2.chooser(random2));
                System.out.print("What is x: ");
                String answer2 = scan.nextLine();
                l2.checkAnswer(answer2);
                if (l2.correct) {
                    if (addLetter != 3 && name.length() < 8) {
                        System.out.print("Please enter a letter to your name: ");
                        String letter = scan.nextLine();
                        eq.addLetter(letter);
                        addLetter++;
                    }
                    System.out.println("Health: " + eq.getName());
                    life++;
                    correct++;
                }
                if (!l2.correct) {
                    eq.removeLetter();
                    System.out.println("Health: " + eq.getName());
                    life--;
                    correct--;
                }
            }
            if (correct < 9 && correct > 5) {
                life = eq.getName().length();
                System.out.println("points: " + correct);
                int random = l3.random();
                System.out.println(l3.chooser(random));
                System.out.print("What is x: ");
                String answer = scan.nextLine();
                l3.checkAnswer(answer);
                if (l3.correct) {
                    if (addLetter != 3 && name.length() < 8) {
                        System.out.print("Please enter a letter to your name: ");
                        String letter = scan.nextLine();
                        eq.addLetter(letter);
                        addLetter++;
                    }
                    System.out.println("Health: " + eq.getName());
                    life++;
                    correct++;
                }
                if (!l3.correct) {
                    eq.removeLetter();
                    System.out.println("Health: " + eq.getName());
                    life--;
                    correct--;
                }
            }
            if (correct == 9) {
                break;
            }
        }
        if (correct == 9) {
            System.out.println("|--------------------------|");
            System.out.println("Congratulations!");
            System.out.println("Thanks for playing " + name);
            System.out.println("|--------------------------|");
        }
        if (life == 0) {
            System.out.println("|--------------------|");
            System.out.println("|You suck get better!|");
            System.out.println("|--------------------|");
        }
    }
}
