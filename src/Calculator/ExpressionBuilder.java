package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpressionBuilder {

    public String readExpression() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, type the your expression:");
        String textExpression = null;
        try {
            textExpression = reader.readLine();
        } catch (IOException e) {
            // todo
        }
        return textExpression;
    }

    public String[] convertExpToSymbol(String expression) {
        return expression.split("[()\t,.a-zA-Z]");
    }
}
