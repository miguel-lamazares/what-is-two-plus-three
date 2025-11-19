
package def.Math;

import def.AscII.Colors;
import def.Locale.Lang;

public class BasicMath {
    public static void basic(java.util.Scanner scanner, String type) {
        Double total = null;
        System.out.println(type);
        while (true) {
            System.out.print("--> ");
            String input = scanner.next();

            if (input.equals("="))
                break;
            double valor;
            try {
                valor = Double.parseDouble(input);

                if (total == null) {
                    total = valor;
                    continue;
                }
                switch (type) {
                    case "+" -> total += valor;
                    case "-" -> total -= valor;
                    case "*" -> total *= valor;
                }
            } catch (NumberFormatException e) {

                System.out.print("\033[1A\033[2K");
                continue;
            }
        }

        if (total > 0) {
            System.out.println(Lang.messages.getString("result") + Colors.GREEN + total + Colors.RESET);
            Again.doItAgain();
        } else if (total < 0) {
            System.out.println(Lang.messages.getString("result") + Colors.RED + total + Colors.RESET);
            Again.doItAgain();
        } else {
            System.out.println(Lang.messages.getString("result") + total + Colors.RESET);
            Again.doItAgain();
        }
    }
}
