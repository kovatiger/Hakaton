import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AI {

   public static void randomName(){
        Random r = new Random();
        List<String> names = new ArrayList<>();
        names.add("Jere");
        names.add("Saatana");
        names.add("Aleksi");
        names.add("Allu");
        names.add("Jani");
       String qwe =  names.get(r.nextInt(5));
        System.out.println(qwe);
    }
    public static void fieldForAI(){
       Character[][] field = new Character[10][10];
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.println("   A " + " B " + " C " + " D " + " E " + " F " + " G " + " H " + " I " + " J ");
            }
            if (i == 9) {
                System.out.print("10");
            } else
                System.out.print(i + 1 + " ");

            for (int j = 0; j < 10; j++) {
                System.out.print("|");
                if (field[i][j] == 'X') {
                    System.out.print(field[i][j]);
                } else {
                    System.out.print(" ");
                }
                System.out.print("|");

            }
            System.out.println();
        }

    }
}
