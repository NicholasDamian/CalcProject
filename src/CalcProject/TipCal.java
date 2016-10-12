package CalcProject;

/**
 * Created by nicholashall on 10/10/16.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class TipCal {
    public void TipCal() throws IOException{
            Menu m1 = new Menu();
            String fileName = "TipCal.txt";
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName,true));
            double billAmount;
            int service;
            double bad = .05;
            double okay = .10;
            double good = .20;
            double great = .30;
            double tip = 0.00;
            double total = 0;
            Scanner inputBillAmount = new Scanner(System.in);
            Scanner inputService = new Scanner(System.in);


            System.out.println("Total bill amount? ");
            billAmount = inputBillAmount.nextDouble();

            System.out.println("How was your service on a scale of 1-4 the tip goes from 5% - 10% - 20% - 30%");
            service = inputService.nextInt();
            if (service == 1) {
                tip = billAmount * bad;
            } else if (service == 2) {
                tip = billAmount * okay;
            } else if (service == 3) {
                tip = billAmount * good;
            } else if (service == 4) {
                tip = billAmount * great;
            } else {
                System.out.println("Honestly not sure what you are doing but please don't break my program");
            }
        tip = Math.ceil(tip*100)/100;
            System.out.println("The tip Amount is: " + tip);
            total = tip + billAmount;
            System.out.println("The total Bill amount plus the tip is " + total);
            outFile.println("Bill Amount "+billAmount+ " With a service rating of "+ service+ " Will equal a tip of: "+ tip );
            outFile.close();
            m1.Menu();
    }
}
