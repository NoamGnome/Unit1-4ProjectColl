import java.util.ArrayList;
public class Level2 {
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
            String an1 = "3";
            if (answer.equals(an1)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 2) {
            String an2 = "6";
            if (answer.equals(an2)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 3) {
            String an3 = "9";
            if (answer.equals(an3)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 4) {
            String an4 = "4";
            if (answer.equals(an4)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 5) {
            String an5 = "17";
            if (answer.equals(an5)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 6) {
            String an6 = "8";
            if (answer.equals(an6)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 7) {
            String an7 = "1";
            if (answer.equals(an7)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 8) {
            String an8 = "2";
            if (answer.equals(an8)) {
                correct = true;
                System.out.println("CORRECT! +1");
            } else {
                correct = false;
                System.out.println("INCORRECT! -1");
            }
        }
        if (random == 9) {
            String an9 = "6";
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
            eq = "4x + 1 = 2x + 7";
            equations.remove(Integer.valueOf(1));
        }
        if (random == 2) {
            eq = "5x + 4 = 3x + 16";
            equations.remove(Integer.valueOf(2));
        }
        if (random == 3) {
            eq = "7x + 1 = 2x + 46";
            equations.remove(Integer.valueOf(3));
        }
        if (random == 4) {
            eq = "6x - 3 = 2x + 13";
            equations.remove(Integer.valueOf(4));
        }
        if (random == 5) {
            eq = "9x - 10 = 7x + 24";
            equations.remove(Integer.valueOf(5));
        }
        if (random == 6) {
            eq = "2x + 21 = 4x + 5";
            equations.remove(Integer.valueOf(6));
        }
        if (random == 7) {
            eq = "x + 2 = 5x - 2";
            equations.remove(Integer.valueOf(7));
        }
        if (random == 8) {
            eq = "5x + 2 = 16 - 2x";
            equations.remove(Integer.valueOf(8));
        }
        if (random == 9) {
            eq = "3x - 1 = 23 - x";
            equations.remove(Integer.valueOf(9));
        }
        return eq;
    }

}
