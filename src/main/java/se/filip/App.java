package se.filip;
import java.util.ArrayList;
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    
    public static void main(String[] args) {
        ArrayList<Integer> talLista = new ArrayList<>();
        System.out.println("mata in tal");
        int tal = Integer.parseInt(System.console().readLine());
        talLista.add(tal);
        while (true) {
            System.out.println("Vill du mata in fler?");
            String answer = System.console().readLine();
            if (answer.equalsIgnoreCase("j")||answer.equalsIgnoreCase("y")|| answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("ja")) {
                tal = Integer.parseInt(System.console().readLine());
                talLista.add(tal);
            }
            else{
                for (int i = 0; i < talLista.size(); i+=2) {
                    //Replace code
                }
                break;
            }
        }
    }
    
}
