
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
            System.out.println(lang.messages.getString("result") + colors.GREEN + total + colors.RESET);
        else if (total < 0)
            System.out.println(lang.messages.getString("result") + colors.RED + total + colors.RESET);
        else
            System.out.println(lang.messages.getString("result") + total + colors.RESET);
    }
}
