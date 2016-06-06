package Calculator;

public class StringConverter {

    private static RPNExpressionBuilder calculateExpression = new RPNExpressionBuilder();

    public static void main(String[] args) throws Exception {
        String templateExpression = calculateExpression.readExpression();
        templateExpression = calculateExpression.convertExpressionToRPN(templateExpression);

        double calculatedValue = calculateExpression.calculate(templateExpression);
        if ((calculatedValue % 1) == 0) {
            System.out.println((int) calculatedValue);
        } else {
            System.out.println(calculatedValue);
        }
    }
}
