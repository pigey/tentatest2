package se.filip;
import java.util.ArrayList;
public class StringFilter {
    public ArrayList<String> remoteShort (ArrayList<String> thelist, int minLenght){
        ArrayList<String> filteredList = new ArrayList<>();
        for (String string : thelist) {
            if (string.length() > minLenght) {
                filteredList.add(string);
            }
        }
        return filteredList;
    }
}
