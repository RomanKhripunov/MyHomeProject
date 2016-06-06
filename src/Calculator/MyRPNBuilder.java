package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyRPNBuilder {

    public String readExpression() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, type the your expression:");
        String textExpression = null;
        try {
            textExpression = reader.readLine().trim().replaceAll("\\s+", "");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return textExpression;
    }

    public String[] convertToRPN(String inputString) {
        return inputString.split("[\\\\s0-9+-]+");
    }
}
