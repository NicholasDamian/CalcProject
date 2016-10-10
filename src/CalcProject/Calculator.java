package CalcProject;

/**
 * Created by nicholashall on 10/10/16.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
    class Calculator {

        public  void Calculator() throws IOException {
            Menu m1 = new Menu();
            Scanner inputYesNo = new Scanner(System.in);
            char yesNo = 'n';
            String fileName = "PastCalculatorResults.txt";
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName,true));

            while (yesNo == 'n') {
                int firstNumber;
                int secondNumber;
                String operator;
                double result = 0;
//                String fileName = "PastCalculatorResults.txt";
                Scanner inputFirst = new Scanner(System.in);
                Scanner inputSecond = new Scanner(System.in);
                Scanner inputOperator = new Scanner(System.in);


                System.out.println("What is the First Number ");
                firstNumber = inputFirst.nextInt();
                System.out.println("The First Number is " + firstNumber);

                System.out.println("What is the Operator? + , / , * ");
                operator = inputOperator.nextLine();
                System.out.println("The Operator is " + operator);

                System.out.println("What is the Second Number ");
                secondNumber = inputSecond.nextInt();
                System.out.println("The Second Number is " + secondNumber);

//                System.out.println("What is the Operator? + , / , % , * ");
//                operator = inputOperator.nextLine();
//                System.out.println("The Operator is " + operator);

                if (operator.equals("*")) {
                    result = firstNumber * secondNumber;
                    System.out.println(result);
                } else if (operator.equals("+")) {
                    result = firstNumber + secondNumber;
                    System.out.println(result);
                } else if (operator.equals("-")) {
                    result = firstNumber - secondNumber;
                    System.out.println(result);
                } else if (operator.equals("/")) {
                    result = firstNumber / secondNumber;
                    System.out.println(result);
                } else
                    System.out.println("I'm bad kid");
                outFile.println(result);

                System.out.println("Would you like to go back to the menu y or n");
                yesNo = inputYesNo.next().charAt(0);
                outFile.println(firstNumber +" "+ operator +" "+secondNumber+" = "+ result);
            }
            outFile.close();
            m1.Menu();
        }
    }








