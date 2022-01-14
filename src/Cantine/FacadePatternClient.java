package Cantine;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {

    private static int  choice;

    public static void main(String args[]) throws NumberFormatException, IOException{
            do{
                System.out.print("========= Cafeteria ============ \n");
                System.out.print("            1. SANDWISH.              \n");
                System.out.print("            2. WARM MEAL.              \n");
                System.out.print("            3. DRINKS.            \n");
                System.out.print("            4. Exit.                     \n");
                System.out.print("Enter your choice: ");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                choice=Integer.parseInt(br.readLine());
                RegisterKeeper rk=new RegisterKeeper();

                switch (choice) {
                    case 1: {
                        rk.sandwichSale();
                    }break;
                    case 2: {
                        rk.warmMealSale();
                    }break;
                    case 3: {
                        rk.drinkSale();
                    }
                    break;
                    default:
                    {
                        System.out.println("Nothing You purchased");
                    }
                    return;
                }

            }while(choice!=4);
        }

}
