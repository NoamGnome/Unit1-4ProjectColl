public class Name {
    private String name = "";
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void addLetter(String letter) {
        if (name.length() < 8) {
            setName(getName() + letter);
        }
    }
    public void removeLetter() {
        if (name.length() - 1 == name.indexOf(" ")) {
            setName(getName().substring(0, getName().length() - 2));
        } else {
            setName(getName().substring(0, getName().length() - 1));
        }
    }

}
