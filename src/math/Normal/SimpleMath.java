package math.Normal;

import def.AscII.Clear;
import def.AscII.Colors;
import def.AscII.JustNumber;
import def.Locale.Lang;
import def.Math.BasicMath;
import def.Math.JustCalc;

import java.util.Scanner;

public class SimpleMath {
    private static Scanner scanner = new Scanner(System.in);

    public static void Normal() {

        Clear.clear();

        System.out.println(Colors.GREEN + Lang.messages.getString("selectN") + Colors.RESET);
        System.out.println(Colors.CYAN + Lang.messages.getString("Noptions") + Colors.RESET);

        int choice = JustNumber.readInt(scanner, 6);
        switch (choice) {
            case 1:
                Clear.clear();
                System.out.println(Colors.BLUE + Lang.messages.getString("sum") + Colors.RESET);
                BasicMath.basic(scanner, "+");
            case 2:
                Clear.clear();
                System.out.println(Colors.BLUE + Lang.messages.getString("sum") + Colors.RESET);
                BasicMath.basic(scanner, "-");
                break;
            case 3:
                Clear.clear();
                System.out.println(Colors.BLUE + Lang.messages.getString("sum") + Colors.RESET);
                BasicMath.basic(scanner, "*");
                break;
            case 4:
                Clear.clear();
                System.out.println(Colors.BLUE + Lang.messages.getString("dv") + Colors.RESET);
                System.out.println(Lang.messages.getString("dv1"));
                while (true) {
                    try {
                        double a = JustCalc.ReadCalc(scanner);
                        System.out.println(Lang.messages.getString("dv2"));
                        double b = JustCalc.ReadCalc(scanner);
                        if (a != 0 && b == 0) {
                            Clear.clear();
                            System.out.println(Colors.BLUE + Lang.messages.getString("zeroerror") + Colors.RESET);
                            System.out.println(Lang.messages.getString("dv1"));
                            continue;
                        }
                        if (a == 0 && b == 0) {
                            System.out.println(Lang.messages.getString("undefined"));
                        }

                         double total = a / b;
                        if (total > 0)
                            System.out.println(Lang.messages.getString("result") + Colors.GREEN + total + Colors.RESET);
                        else if (total < 0)
                            System.out.println(Lang.messages.getString("result") + Colors.RED + total + Colors.RESET);
                        else
                            System.out.println(Lang.messages.getString("result") + total + Colors.RESET);
                        break;
                    } catch (NumberFormatException e) {

                        System.out.print("\033[1A\033[2K");
                        scanner.nextLine();
                        continue;
                    }

                }
                break;
            default:
                System.out.println(Colors.RED + Lang.messages.getString("invalidOption") + Colors.RESET);
                break;
        }
    }
}
