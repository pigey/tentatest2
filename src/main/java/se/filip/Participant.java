package se.filip;

public class Participant {
    private String name;
    private String club;
    
    public Participant(String name, String club) {
        super();
        this.name = name;
        this.club = club;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setClub(String club){
        this.club = club;
    }
    public String getClub(){
        return club;
    }
}
