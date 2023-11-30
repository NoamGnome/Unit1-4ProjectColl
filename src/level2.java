import java.util.Scanner;
import java.util.ArrayList;
public class level1 {
    ArrayList<Integer> equations = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    EquationClass eq = new EquationClass();
    boolean one = true;
    boolean two = true;
    boolean three = true;
    boolean four = true;
    boolean five = true;
    boolean six = true;
    boolean seven = true;
    boolean eight = true;
    boolean nine = true;
    private int random = 0;
    boolean correct = false;

    public int random() {
        equations.add(1);
        equations.add(2);
        equations.add(3);
        equations.add(4);
        equations.add(5);
        equations.add(6);
        equations.add(7);
        equations.add(8);
        equations.add(9);
        equations.add(10);
        random = (int) (Math.random() * equations.size());
        return random;
    }

    public void checkAnswer(String answer) {
        if (random == 1) {
            String an1 = "5";
            if (answer.equals(an1)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 2) {
            String an2 = "8";
            if (answer.equals(an2)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 3) {
            String an3 = "5";
            if (answer.equals(an3)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 4) {
            String an4 = "8";
            if (answer.equals(an4)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 5) {
            String an5 = "3";
            if (answer.equals(an5)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 6) {
            String an6 = "9";
            if (answer.equals(an6)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 7) {
            String an7 = "7";
            if (answer.equals(an7)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 8) {
            String an8 = "9";
            if (answer.equals(an8)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 9) {
            String an9 = "8";
            if (answer.equals(an9)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
    }
    public String chooser(int random) {
        String eq = "";
        if (random == 1 && one) {
            eq = "7 + x = 12";
            equations.remove(0);
            one = false;
        }
        if (random == 2 && two) {
            eq = "16 - x = 8";
            equations.remove(1);
            two = false;
        }
        if (random == 3 && three) {
            eq = "x / 1 = 5";
            equations.remove(2);
            three = false;
        }
        if (random == 4 && four) {
            eq = "x + 9 = 17";
            equations.remove(3);
            four = false;
        }
        if (random == 5 && five) {
            eq = "x * 6 = 18";
            equations.remove(4);
            five = false;
        }
        if (random == 6 && six) {
            eq = "36 / x = 4";
            equations.remove(5);
            six = false;
        }
        if (random == 7 && seven) {
            eq = "x + 6 = 13";
            equations.remove(6);
            seven = false;
        }
        if (random == 8 && eight) {
            eq = "18 - x = 9";
            equations.remove(7);
            eight = false;
        }
        if (random == 9 && nine) {
            eq = "15 - x = 7";
            equations.remove(8);
            nine = false;
        }
        return eq;
    }

}
