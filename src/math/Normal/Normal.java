package math.Normal;

import def.colors;
import def.Clear;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Normal {
    public static void normal() {

        // inicializa o ResourceBundle (ajuste "messages" para o nome do seu arquivo .properties)
        ResourceBundle mensages = ResourceBundle.getBundle("messages", Locale.getDefault());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(mensages.getString("selectN")); // ex: "1) Adição\n0) Sair"

            int choicen;
            if (!scanner.hasNextInt()) {
                System.out.println(colors.RED + mensages.getString("invalid") + colors.RESET);
                scanner.nextLine();
                Clear.clear();
                continue;
            }

            choicen = scanner.nextInt();
            scanner.nextLine();

            switch (choicen) {
                case 1:
                    Clear.clear();
                    System.out.println(colors.GREEN + mensages.getString("add") + colors.RESET); // ex: "Digite dois números:"
                    System.out.print("> ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println(colors.RED + mensages.getString("invalidNumber") + colors.RESET);
                        scanner.nextLine();
                        break;
                    }
                    double a = scanner.nextDouble();
                    System.out.print("> ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println(colors.RED + mensages.getString("invalidNumber") + colors.RESET);
                        scanner.nextLine();
                        break;
                    }
                    double b = scanner.nextDouble();
                    scanner.nextLine();
                    double sum = a + b;
                    System.out.println(colors.GREEN + mensages.getString("result") + ": " + sum + colors.RESET);
                    break;
                case 0:
                    Clear.clear();
                    System.out.println(colors.GREEN + mensages.getString("goodbye") + colors.RESET);
                    scanner.close();
                    return;
                default:
                    System.out.println(colors.RED + mensages.getString("invalidOption") + colors.RESET);
                    break;
            }
        }
    }
}
