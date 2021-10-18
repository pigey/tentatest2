package se.filip;
import java.util.ArrayList;
public class ParticipentRun {
    public void run(){
        ArrayList<Participant> deltagare = new ArrayList<>();
        Participant person = new Participant("Filip", "hammarby");
        deltagare.add(person);
        Competition comp = new Competition("tourTheFrance", "2021-10-18", "Paris", deltagare);
        comp.deltagarLista();
    }
}
