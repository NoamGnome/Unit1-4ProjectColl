import java.util.Scanner;
import java.util.ArrayList;
public class Level1 {
    ArrayList<Integer> equations = new ArrayList<>();
    private int random;
    boolean correct = false;

    public void populate()
    {
        for(int i = 1; i < 10; i++)
        {
            equations.add(i);
        }
    }
    //DOTADIW:  Do one thing, and do it well.
    public int random() {
        int index = (int) (Math.random() * equations.size());
        random = equations.get(index);
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
        if (random == 1) {
            eq = "7 + x = 12";
            equations.remove(Integer.valueOf(1));
        }
        if (random == 2) {
            eq = "16 - x = 8";
            equations.remove(Integer.valueOf(2));
        }
        if (random == 3) {
            eq = "x / 1 = 5";
            equations.remove(Integer.valueOf(3));
        }
        if (random == 4) {
            eq = "x + 9 = 17";
            equations.remove(Integer.valueOf(4));
        }
        if (random == 5) {
            eq = "x * 6 = 18";
            equations.remove(Integer.valueOf(5));
        }
        if (random == 6) {
            eq = "36 / x = 4";
            equations.remove(Integer.valueOf(6));
        }
        if (random == 7) {
            eq = "x + 6 = 13";
            equations.remove(Integer.valueOf(7));
        }
        if (random == 8) {
            eq = "18 - x = 9";
            equations.remove(Integer.valueOf(8));
        }
        if (random == 9) {
            eq = "15 - x = 7";
            equations.remove(Integer.valueOf(9));
        }
        return eq;
    }

}
