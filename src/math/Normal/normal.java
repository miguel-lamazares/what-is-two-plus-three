package math.Normal;

import def.Clear;
import def.colors;
import def.justNumeber;
import def.lang;

import java.util.Scanner;

public class normal {
    private static Scanner scanner = new Scanner(System.in); 
    

    public static void Normal(){

        Clear.clear();

        System.out.println(colors.GREEN + lang.messages.getString("selectN") + colors.RESET);

        int choice = justNumeber.readInt(scanner, 6); 
        switch (choice) {
            case 1:
                
                break;
        
            default:
                break;
        }
    } 
}
