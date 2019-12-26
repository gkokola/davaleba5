package davaleba5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.print("ჩაწერეთ მაგალითი: ");
        String userInput = input.nextLine();
        String[] tokens = userInput.split(" ");
        switch (tokens[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(tokens[0])
                        + Integer.parseInt(tokens[2]);
                break;
            case '-':
                result = Integer.parseInt(tokens[0])
                        - Integer.parseInt(tokens[2]);
                break;
            case '*':
                result = Integer.parseInt(tokens[0])
                        * Integer.parseInt(tokens[2]);
                break;
            case '/':
                result = Integer.parseInt(tokens[0])
                        / Integer.parseInt(tokens[2]);
        }
        System.out.println(tokens[0] + ' ' + tokens[1] + ' '
                + tokens[2] + " = " + result);


        FullCalculator calc = new FullCalculator();
        calc.processInput(userInput);

        BufferedWriter writer = new BufferedWriter(new FileWriter("calculator.txt", true));
        writer.write(result);
        writer.close();
    }
}