
import math.Normal.SimpleMath;
import def.AscII.Asc;
import def.AscII.Clear;
import def.AscII.Colors;
import def.AscII.JustNumber;
import def.Locale.Lang;

// imports here for packages

import java.util.Scanner;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(Colors.GREEN + Asc.ASCII_ART + Colors.RESET);
        System.out.println(
                Colors.BLUE
                        + "\n\n\nPresione Enter para continuar... Press Enter to continue... Pressione Enter para continuar... 続行するには Enter キーを押してください。..."
                        + Colors.RESET);
        scanner.nextLine();
        Clear.clear();


        while (true) {

            System.out.println(
                    Colors.PURPLE + "Selecione um idioma / Set a languege / seleccione un idioma\n" + Colors.RESET);
            System.out.println(Colors.GREEN + "1 - Português (Brasil)\n" + Colors.BLUE + "2 - English (United States)\n"
                    + Colors.YELLOW + "3 - Español (España)\n" + Colors.RED + "4 - 日本語 (日本)" + Colors.RESET + "\n");

            int choice;        
            choice = JustNumber.readInt(scanner, 5);
            

            switch (choice) {
                case 1:
                    Lang.messages = ResourceBundle.getBundle("lang.BR", Locale.forLanguageTag("pt-BR"));
                    break;
                case 2:
                    Lang.messages = ResourceBundle.getBundle("lang.EN", Locale.forLanguageTag("en-US"));
                    break;
                case 3:
                    Lang.messages = ResourceBundle.getBundle("lang.ES", Locale.forLanguageTag("es-ES"));
                    break;
                case 4:
                    Lang.messages = ResourceBundle.getBundle("lang.JP", Locale.forLanguageTag("ja-JP"));
                    break;
                default:
                    System.out.println(Colors.RED
                            + "Opção inválida. Tente novamente.\nInvalid option. Try again.\nOpción inválida. Inténtalo de nuevo.\n無効なオプションです。もう一度お試しください。"
                            + Colors.RESET);
                    Clear.clear();
                    continue;
            }
            break;
        }

        System.out.println(Lang.messages.getString("enter"));
        scanner.nextLine();
        Clear.clear();

        System.out.println(Colors.GREEN + Lang.messages.getString("what_you_want") + Colors.RESET);
        System.out.println(Colors.CYAN + Lang.messages.getString("options") + Colors.RESET);
        
        int choice = JustNumber.readInt(scanner, 3);
        

        switch (choice) {
            case 1:
                SimpleMath.Normal();
                break;

            default:
                break;
        }

    }
}
