import java.util.Scanner;
public class level1 {
    Scanner scan = new Scanner(System.in);
    EquationClass eq = new EquationClass();
    private int random = 0;
    boolean correct = false;
    private String an1 = "5";
    private String an2 = "8";
    private String an3 = "5";
    private String an4 = "8";
    private String an5 = "3";
    private String an6 = "9";
    private String an7 = "7";
    private String an8 = "9";
    private String an9 = "8";
    private String an10 = "3";
    public int random() {
        return random = (int) ((Math.random() * 100) / 10);
    }

    public void checkAnswer(String answer) {
        if (random == 1) {
            if (answer.equals(an1)) {
                correct = true;
                System.out.print("CORRECT! +1");
                System.out.println();
                System.out.print("Please enter a letter to your name: ");
                String letter = scan.nextLine();
                eq.addLetter(letter);
                System.out.println(eq.getName());
            } else {
                System.out.print("INCORRECT! -1");
            }
        } else if (random == 2) {
            if (answer.equals(an2)) {
                correct = true;
                System.out.print("CORRECT! +1");
                System.out.println();
                System.out.print("Please enter a letter to your name: ");
                String letter = scan.nextLine();
                eq.addLetter(letter);
                System.out.println(eq.getName());
            } else {
                System.out.print("INCORRECT! -1");
            }
        } else if (random == 3) {
            if (answer.equals(an3)) {
                correct = true;
                System.out.print("CORRECT! +1");
                System.out.println();
                System.out.print("Please enter a letter to your name: ");
                String letter = scan.nextLine();
                eq.addLetter(letter);
                System.out.println(eq.getName());
            } else {
                System.out.print("INCORRECT! -1");
            }
        } else if (random == 4) {
            if (answer.equals(an4)) {
                correct = true;
                System.out.print("CORRECT! +1");
                System.out.println();
                System.out.print("Please enter a letter to your name: ");
                String letter = scan.nextLine();
                eq.addLetter(letter);
                System.out.println(eq.getName());
            } else {
                System.out.print("INCORRECT! -1");
            }
        } else if (random == 5) {
            if (answer.equals(an5)) {
                correct = true;
                System.out.print("CORRECT! +1");
                System.out.println();
                System.out.print("Please enter a letter to your name: ");
                String letter = scan.nextLine();
                eq.addLetter(letter);
                System.out.println(eq.getName());
            } else {
                System.out.print("INCORRECT! -1");
            }
        } else if (random == 6) {
            if (answer.equals(an6)) {
                correct = true;
                System.out.print("CORRECT! +1");
                System.out.println();
                System.out.print("Please enter a letter to your name: ");
                String letter = scan.nextLine();
                eq.addLetter(letter);
                System.out.println(eq.getName());
            } else {
                System.out.print("INCORRECT! -1");
            }
        } else if (random == 7) {
            if (answer.equals(an7)) {
                correct = true;
                System.out.print("CORRECT! +1");
                System.out.println();
                System.out.print("Please enter a letter to your name: ");
                String letter = scan.nextLine();
                eq.addLetter(letter);
                System.out.println(eq.getName());
            } else {
                System.out.print("INCORRECT! -1");
            }
        } else if (random == 8) {
            if (answer.equals(an8)) {
                correct = true;
                System.out.print("CORRECT! +1");
                System.out.println();
                System.out.print("Please enter a letter to your name: ");
                String letter = scan.nextLine();
                eq.addLetter(letter);
                System.out.println(eq.getName());
            } else {
                System.out.print("INCORRECT! -1");
            }
        } else if (random == 9) {
            if (answer.equals(an9)) {
                correct = true;
                System.out.print("CORRECT! +1");
                System.out.println();
                System.out.print("Please enter a letter to your name: ");
                String letter = scan.nextLine();
                eq.addLetter(letter);
                System.out.println(eq.getName());
            } else {
                System.out.print("INCORRECT! -1");
            }
        } else {
            if (answer.equals(an10)) {
                correct = true;
                System.out.print("CORRECT! +1");
                System.out.println();
                System.out.print("Please enter a letter to your name: ");
                String letter = scan.nextLine();
                eq.addLetter(letter);
                System.out.println(eq.getName());
            } else {
                System.out.print("INCORRECT! -1");
            }
        }
    }
    public String chooser(int random) {
        String eq;
        if (random == 1) {
            eq = "7 + x = 12";
        } else if (random == 2) {
            eq = "16 - x = 8";
        } else if (random == 3) {
            eq = "x / 1 = 5";
        } else if (random == 4) {
            eq = "x + 9 = 17";
        } else if (random == 5) {
            eq = "x * 6 = 18";
        } else if (random == 6) {
            eq = "36 / x = 4";
        } else if (random == 7) {
            eq = "x + 6 = 13";
        } else if (random == 8) {
            eq = "18 - x = 9";
        } else if (random == 9) {
            eq = "15 - x = 7";
        } else {
            eq = "x * 3 = 9";
        }
        return eq;
    }

}
