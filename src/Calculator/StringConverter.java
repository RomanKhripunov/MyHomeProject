package Calculator;

import java.util.Arrays;

public class StringConverter {

    public static void main(String[] args) {
        ExpressionBuilder reader = new ExpressionBuilder();
        String templateExpression = reader.readExpression();
        System.out.println(Arrays.toString(reader.convertExpToSymbol(templateExpression)));
    }
}
