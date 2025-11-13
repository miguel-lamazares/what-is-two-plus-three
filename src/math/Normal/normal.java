package math.Normal;

import def.Clear;
import def.colors;
import def.justNumber;
import def.lang;
import def.BasicMath;

import java.util.Scanner;

public class normal {
    private static Scanner scanner = new Scanner(System.in);

    public static void Normal() {

        Clear.clear();

        System.out.println(colors.GREEN + lang.messages.getString("selectN") + colors.RESET);

        int choice = justNumber.readInt(scanner, 6);
        switch (choice) {
            case 1:
                Clear.clear();
                System.out.println(colors.BLUE + lang.messages.getString("sum") + colors.RESET);
                BasicMath.basic(scanner, "+");
            case 2:
                Clear.clear();
                System.out.println(colors.BLUE + lang.messages.getString("sum") + colors.RESET);
                BasicMath.basic(scanner, "-");
                break;
            case 3:
                Clear.clear();
                System.out.println(colors.BLUE + lang.messages.getString("sum") + colors.RESET);
                BasicMath.basic(scanner, "*");
                break;
            case 4:
                Clear.clear();
                System.out.println(colors.BLUE + lang.messages.getString("dv") + colors.RESET);
                System.out.println(lang.messages.getString("dv1"));
                double a, b, total;
                while (true) {
                    try {
                        a = scanner.nextDouble();
                        if (a == 0) {
                            System.out.println(colors.BLUE + lang.messages.getString("zeroerror") + colors.RESET);
                            System.out.println(lang.messages.getString("dv1"));
                            continue;
                        }
                        System.out.println(lang.messages.getString("dv2"));
                        b = scanner.nextDouble();
                        if (a == 0 && b == 0) {
                            System.out.println(lang.messages.getString("undefined"));
                        }

                        total = a / b;
                        if (total > 0)
                            System.out.println(lang.messages.getString("result") + colors.GREEN + total + colors.RESET);
                        else if (total < 0)
                            System.out.println(lang.messages.getString("result") + colors.RED + total + colors.RESET);
                        else
                            System.out.println(lang.messages.getString("result") + total + colors.RESET);
                        break;
                    } catch (NumberFormatException e) {

                        System.out.print("\033[1A\033[2K");
                        scanner.nextLine();
                        continue;
                    }

                }
                break;
            default:
                System.out.println(colors.RED + lang.messages.getString("invalidOption") + colors.RESET);
                break;
        }
    }
}
