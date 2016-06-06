package Calculator;

public class StringConverter {

    private static RPNExpressionBuilder calculateExpression = new RPNExpressionBuilder();

    public static void main(String[] args) throws Exception {
        String exitFlag = null;
        String templateExpression = calculateExpression.readExpression();
        templateExpression = calculateExpression.convertExpressionToRPN(templateExpression);
    }
}
