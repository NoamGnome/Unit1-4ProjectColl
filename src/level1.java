import java.util.Scanner;
public class level1 {
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
    boolean ten = true;
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
        return random = (int) (Math.random() * 10);
    }

    public void checkAnswer(String answer) {
        if (random == 1) {
            if (answer.equals(an1)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        } else if (random == 2) {
            if (answer.equals(an2)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        } else if (random == 3) {
            if (answer.equals(an3)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        } else if (random == 4) {
            if (answer.equals(an4)) {
                correct = true;
                System.out.println("CORRECT! +1");
                System.out.println();
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        } else if (random == 5) {
            if (answer.equals(an5)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        } else if (random == 6) {
            if (answer.equals(an6)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        } else if (random == 7) {
            if (answer.equals(an7)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        } else if (random == 8) {
            if (answer.equals(an8)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        } else if (random == 9) {
            if (answer.equals(an9)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        } else {
            if (answer.equals(an10)) {
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
            one = false;
        } else if (random == 2 && two) {
            eq = "16 - x = 8";
            two = false;
        } else if (random == 3 && three) {
            eq = "x / 1 = 5";
            three = false;
        } else if (random == 4 && four) {
            eq = "x + 9 = 17";
            four = false;
        } else if (random == 5 && five) {
            eq = "x * 6 = 18";
            five = false;
        } else if (random == 6 && six) {
            eq = "36 / x = 4";
            six = false;
        } else if (random == 7 && seven) {
            eq = "x + 6 = 13";
            seven = false;
        } else if (random == 8 && eight) {
            eq = "18 - x = 9";
            eight = false;
        } else if (random == 9 && nine) {
            eq = "15 - x = 7";
            nine = false;
        } else {
            if (ten) {
                eq = "x * 3 = 9";
                ten = false;
            }
        }
        return eq;
    }

}
