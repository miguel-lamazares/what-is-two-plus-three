package math.Normal;

import def.Clear;
import def.Colors;
import def.JustNumber;
import def.Lang;
import def.BasicMath;

import java.util.Scanner;

public class SimpleMath {
    private static Scanner scanner = new Scanner(System.in);

    public static void Normal() {

        Clear.clear();

        System.out.println(Colors.GREEN + Lang.messages.getString("selectN") + Colors.RESET);

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
                double a, b, total;
                while (true) {
                    try {
                        a = scanner.nextDouble();
                        System.out.println(Lang.messages.getString("dv2"));
                        b = scanner.nextDouble();
                        if (a != 0 && b == 0) {
                            Clear.clear();
                            System.out.println(Colors.BLUE + Lang.messages.getString("zeroerror") + Colors.RESET);
                            System.out.println(Lang.messages.getString("enter"));
                            System.out.println(Lang.messages.getString("dv1"));
                            continue;
                        }
                        if (a == 0 && b == 0) {
                            System.out.println(Lang.messages.getString("undefined"));
                        }

                        total = a / b;
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
