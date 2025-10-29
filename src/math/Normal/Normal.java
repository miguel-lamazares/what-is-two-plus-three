
package math.Normal;

import def.colors;
import def.Clear;


public class Normal {
    public static void normal(){
        

        double a, b, c, d, e = 0;

        while(true){
            System.out.println(mensages.getString("selectN"));

            int choicen;
            if(!scanner.hasNextInt()){
                System.out.println(colors.RED + mensages.getString("invalid") + colors.RESET);
                scanner.nextLine();
                Clear.clear();
                continue;
            }

            choicen = scanner.nextInt();
            scanner.nextLine();

            switch (choicen) {
                case 1:
                    System.out.println(colors.GREEN + mensages.getString("add"));
                    
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
