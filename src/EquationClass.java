public class EquationClass {
    private String name = "";
    public EquationClass() {
        this.name = name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void addLetter(String letter) {
        setName(getName() + " " + letter);
    }
    public void removeLetter() {
        if (getName().substring(getName().length()).equals(" ")) {

        }
        setName(getName())
    }

}
