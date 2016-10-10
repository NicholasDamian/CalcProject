package CalcProject;

/**
 * Created by nicholashall on 10/10/16.
 */
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
public class Grocery {

    Menu m1 = new Menu();
    double price;
    ArrayList<Double> itemPrice = new ArrayList<>();
    Scanner inputPrice = new Scanner(System.in);
    String addRemove;
    Scanner inputAddRemove = new Scanner(System.in);
    double sum = 0;
    int postion;
    Scanner inputPostion = new Scanner(System.in);




    public void Grocery() throws IOException{
//        Menu m1 = new Menu();
//        double price;
//        ArrayList<Double> itemPrice = new ArrayList<>();
//        Scanner inputPrice = new Scanner(System.in);
//        String addRemove;
//        Scanner inputAddRemove = new Scanner(System.in);

//        System.out.println("Please enter the price of your next/first grocery ");
//        price = inputPrice.nextDouble();
//        itemPrice.add(price);
        System.out.println("Would you like to add, remove item prices? Or showTax. enter showList too also see current list or Menu to return to the Menu");
        addRemove = inputAddRemove.nextLine();
            if(Objects.equals(addRemove, "add")){
                System.out.println("Please enter the price of your next/first grocery ");
                price = inputPrice.nextDouble();
                itemPrice.add(price);
                Grocery();
            }


            else if(Objects.equals(addRemove, "remove")){
                for(int i = 0; i < itemPrice.size();++i){
                    System.out.println(i+". "+itemPrice.get(i));
                }
                System.out.println("Enter the Position in the list starting with 0 of which item you would like to remove");
                postion = inputPostion.nextInt();
                itemPrice.remove(postion);
                Grocery();

            }



            else if(Objects.equals(addRemove, "showTax")) {
                for(int i = 0; i < itemPrice.size();++i){
                    sum = sum + itemPrice.get(i);
                }
                System.out.println(sum * .06);
                Grocery();
            }


            else if (Objects.equals(addRemove, "showList")){
                for(int i = 0; i < itemPrice.size();++i){
                    System.out.println(i+". "+itemPrice.get(i));
                }
                Grocery();
            }

            else if (Objects.equals(addRemove, "Menu")){
                m1.Menu();
            }
        m1.Menu();
    }
}
