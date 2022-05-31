package futbol;

public class Player {
    // atributos
    private String name;
    private String surname;
    private int goals;

    // métodos
    // Constructores

    public Player() {
        this.name = "";
        this.surname = "";
        this.goals = 0;
    }
    public Player(String name, String surname, int goals) {
        this.name = name;
        this.surname = surname;
        this.goals = goals;
    }

    // Otros métodos (setters y getters)

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getGoals() {
        return goals;
    }
    public void setGoals(int goals) {
        this.goals = goals;
    }
}
