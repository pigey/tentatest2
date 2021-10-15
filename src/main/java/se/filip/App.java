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
        ColorCheck colorcheck = new ColorCheck();
        colorcheck.run();
        
    }
}
