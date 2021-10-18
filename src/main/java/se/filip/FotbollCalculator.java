package se.filip;

public class FotbollCalculator {
    public int calculatePoints(int wins, int draws, int losses){
        int winpoints = wins *3;
        int drawpoints = draws * 1;
        int total = winpoints + drawpoints;
        return total;
    }
    public void run(){
        System.out.println("Hur många matcher har du vunnit?");
        int wins = Integer.parseInt(System.console().readLine());
        System.out.println("Hur många matcher har du kommit lika?");
        int draws = Integer.parseInt(System.console().readLine());
        System.out.println("Hur många matcher har du förlorat?");
        int loss = Integer.parseInt(System.console().readLine());
        int svar =calculatePoints(wins, draws, loss);
        System.out.println(svar);
    }
}
