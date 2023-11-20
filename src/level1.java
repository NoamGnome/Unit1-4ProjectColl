public class level1 {
    private String user_answer = "";
    private int random = 0;
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
    public void level1() {
        random = (int) ((Math.random() * 100) / 10);
    }
    public String chooser() {
        String eq1 = "7 + x = 12";
        String eq2 = "16 - x = 8";
        String eq3 = "x / 1 = 5";
        String eq4 = "x + 9 = 17";
        String eq5 = "x * 6 = 18";
        String eq6 = "36 / x = 4";
        String eq7 = "x + 6 = 13";
        String eq8 = "18 - x = 9";
        String eq9 = "15 - x = 7";
        String eq10 = "x * 3 = 9";
        if (random == 1) {
            return eq1;
        } else if (random == 2) {
            return eq2;
        } else if (random == 3) {
            return eq3;
        } else if (random == 4) {
            return eq4;
        } else if (random == 5) {
            return eq5;
        } else if (random == 6) {
            return eq6;
        } else if (random == 7) {
            return eq7;
        } else if (random == 8) {
            return eq8;
        } else if (random == 9) {
            return eq9;
        } else {
            return eq10;
        }
    }
    public void String answer() {
        if (chooser() == eq1);

    }

}
