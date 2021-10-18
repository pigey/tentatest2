package se.filip;

import java.util.ArrayList;

public class Competition {
    private String name;
    private String date;
    private String location;
    ArrayList<Participant> deltagare = new ArrayList<>();
    public Competition(String name, String date, String location, ArrayList<Participant> deltagare) {
        super();
        this.name = name;
        this.date = date;
        this.location = location;
        this.deltagare = deltagare;
    }
    public void deltagarLista(){
        System.out.println(name+ ", "+ date +", "+ location);
        System.out.println("-----------------------------------");
        for (Participant participant : deltagare) {
            System.out.println(participant.getName() +" "+ participant.getClub());
        }
    }
}
