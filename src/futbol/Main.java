package futbol;

public class Main {
    public static void main(String[] args) {
        Player jugador1 = new Player();
        System.out.println(jugador1.getGoals());
        jugador1.setGoals(2);
        System.out.println(jugador1.getGoals());
        Player jugador2 = new Player("Gareth","Bale",0);
        System.out.println(jugador2.getName());
    }
}
