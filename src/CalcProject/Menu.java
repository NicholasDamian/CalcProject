package CalcProject;

/**
 * Created by nicholashall on 10/10/16.
 */
import java.io.IOException;
import java.util.Scanner;
public class Menu {

    public void Menu() throws IOException {
        int option;
        Scanner inputOption = new Scanner(System.in);
        Calculator c1 = new Calculator();
        TipCal t1 = new TipCal();
        Grocery g1 = new Grocery();

//        c1.Calculator();
//        t1.TipCal();
//        g1.Grocery();


        System.out.println("Please choose from the following options to progress to what option you would like.");
        System.out.println("1:  Calculator");
        System.out.println("2: Calculate Tip");
        System.out.println("3: Grocery List");
        System.out.println("4: Past Calculations");
        System.out.println("5: Help");
        System.out.println("6: Quit");
        option = inputOption.nextInt();
        if(option == 1){
            c1.Calculator();
        } else if( option == 2){
            t1.TipCal();
        } else if ( option == 3){
            g1.Grocery();
        } else if (option == 4){

        }

    }
}
