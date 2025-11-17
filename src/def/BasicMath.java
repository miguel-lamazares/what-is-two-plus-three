
package def;

public class BasicMath {
    public static void basic(java.util.Scanner scanner, String type) {
        double total = 0;
        System.out.println(type); 
        while (true) {  
            System.out.print("--> ");
            String input = scanner.next();

            if (input.equals("=")) break;

            try {
                double valor = Double.parseDouble(input);

                
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

        
        if (total > 0)
            System.out.println(Lang.messages.getString("result") + Colors.GREEN + total + Colors.RESET);
        else if (total < 0)
            System.out.println(Lang.messages.getString("result") + Colors.RED + total + Colors.RESET);
        else
            System.out.println(Lang.messages.getString("result") + total + Colors.RESET);
    }
}
