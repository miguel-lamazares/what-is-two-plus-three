
import def.colors;
import def.asc;
import def.Clear;

import math.Normal.*;

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
                colors.BLUE + "\n\n\nPrecione Enter para continuar...Press Enter to continue..." + colors.RESET);
        scanner.nextLine();
        Clear.clear();

        ResourceBundle messages = null;
        Locale locale = null;

        while (true) {

            System.out.println(
                    colors.RED + "Selecione um idioma / Set a languege / seleccione un idioma\n" + colors.RESET);
            System.out.println(colors.GREEN + "1 - Português (Brasil)\n" + colors.BLUE + "2 - English (United States)\n"
                    + colors.YELLOW + "3 - Español (España)\n" + colors.RESET);

            int choice;

            if (!scanner.hasNextInt()) {
                System.out.println(colors.RED
                        + "Opção inválida. Tente novamente.\nInvalid option. Try again.\nOpción inválida. Inténtalo de nuevo."
                        + colors.RESET);
                scanner.nextLine();
                Clear.clear();
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    messages = ResourceBundle.getBundle("lang.BR", Locale.forLanguageTag("pt-BR"));
                    break;
                case 2:
                    messages = ResourceBundle.getBundle("lang.EN", Locale.forLanguageTag("en-US"));
                    break;
                case 3:
                    messages = ResourceBundle.getBundle("lang.ES", Locale.forLanguageTag("es-ES"));
                    break;
                default:
                    System.out.println(colors.RED
                            + "Opção inválida. Tente novamente.\nInvalid option. Try again.\nOpción inválida. Inténtalo de nuevo."
                            + colors.RESET);
                    Clear.clear();
                    continue;
            }
            break;
        }

        System.out.println(messages.getString("enter"));
        scanner.nextLine();
        Clear.clear();

        while (true) {
            System.out.println(colors.GREEN + messages.getString("what_you_want"));
            System.out.println(colors.CYAN + messages.getString("options"));
            

            int choice;
            if (!scanner.hasNextInt()) {
                System.out.println(colors.RED + messages.getString("invalid") + colors.RESET);
                scanner.nextLine();
                Clear.clear();
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    break;

                default:
                    break;
            }

        }

    }
}
