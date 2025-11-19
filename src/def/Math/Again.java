package def.Math;

import def.Locale.Lang;
import def.AscII.*;

import java.util.Scanner;



public class Again {
    public static void doItAgain() {
        System.out.println(Lang.messages.getString("enter"));
        Scanner scanner = new Scanner(System.in);
        
        scanner.nextLine();
        Clear.clear();

        System.out.println(Colors.PURPLE + Lang.messages.getString("Again") + Colors.RESET);
        System.out.println(Colors.CYAN + Lang.messages.getString("AgainOptions") + Colors.RESET);

        int choice;
        choice = JustNumber.readInt(scanner, 5);

        switch (choice) {
            case 1:
                System.out.println("");
                System.exit(0);
                break;
            case 2:
                Clear.clear();
                break;
            case 3:
                Clear.clear();
                break;
            case 4:
                break;

            default:
                break;
        }
    }
}
