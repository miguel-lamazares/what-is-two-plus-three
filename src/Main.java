
import def.colors;
import def.justNumeber;
import math.Normal.normal;
import def.asc;
import def.Clear;
import def.justNumeber;
import def.lang;

import java.awt.Color;

// imports here for packages

import java.util.Scanner;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(colors.GREEN + asc.ASCII_ART + colors.RESET);
        System.out.println(
                colors.BLUE
                        + "\n\n\nPresione Enter para continuar... Press Enter to continue... Pressione Enter para continuar... 続行するには Enter キーを押してください。..."
                        + colors.RESET);
        scanner.nextLine();
        Clear.clear();


        while (true) {

            System.out.println(
                    colors.PURPLE + "Selecione um idioma / Set a languege / seleccione un idioma\n" + colors.RESET);
            System.out.println(colors.GREEN + "1 - Português (Brasil)\n" + colors.BLUE + "2 - English (United States)\n"
                    + colors.YELLOW + "3 - Español (España)\n" + colors.RED + "4 - 日本語 (日本)" + colors.RESET + "\n");

            int choice;        
            choice = justNumeber.readInt(scanner, 4);
            

            switch (choice) {
                case 1:
                    lang.messages = ResourceBundle.getBundle("lang.BR", Locale.forLanguageTag("pt-BR"));
                    break;
                case 2:
                    lang.messages = ResourceBundle.getBundle("lang.EN", Locale.forLanguageTag("en-US"));
                    break;
                case 3:
                    lang.messages = ResourceBundle.getBundle("lang.ES", Locale.forLanguageTag("es-ES"));
                    break;
                case 4:
                    lang.messages = ResourceBundle.getBundle("lang.JP", Locale.forLanguageTag("ja-JP"));
                    break;
                default:
                    System.out.println(colors.RED
                            + "Opção inválida. Tente novamente.\nInvalid option. Try again.\nOpción inválida. Inténtalo de nuevo.\n無効なオプションです。もう一度お試しください。"
                            + colors.RESET);
                    Clear.clear();
                    continue;
            }
            break;
        }

        System.out.println(lang.messages.getString("enter"));
        scanner.nextLine();
        Clear.clear();

        System.out.println(colors.GREEN + lang.messages.getString("what_you_want") + colors.RESET);
        System.out.println(colors.CYAN + lang.messages.getString("options") + colors.RESET);
        
        int choice = justNumeber.readInt(scanner, 3);
        

        switch (choice) {
            case 1:
                normal.Normal();
                break;

            default:
                break;
        }

    }
}
