package se.filip;
import java.util.ArrayList;
public class ColorCheck {
    public void run(){
        ArrayList<String> colorList = new ArrayList<>();
       System.out.println("Skriv in färger, 'x' to exit");
       while (true) {
           System.out.print("Add color:");
           String newColor = System.console().readLine();
           colorList.add(newColor);
           if (newColor.equalsIgnoreCase("x")) {
               colorList.remove(colorList.size()-1);
               for (int i = 0; i < colorList.size(); i++) {
                   System.out.println(colorList.get(i));
               }
               break;
           }
                int check = 0;
                if (colorList.size()>1) {
                    int latestColor = colorList.size() -1;
                    for (int i = 0; i < colorList.size()-1; i++) {
                        String colorCheck = colorList.get(i);
                        if (colorCheck.equalsIgnoreCase(colorList.get(latestColor))) {
                            check=1;
                        }
                    }
                    if (check==1) {
                        colorList.remove(latestColor);
                        check=0;
                    }
                }
                
           
           
       }
    }
}
