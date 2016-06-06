package Calculator;

public class StringConverter {

    //    private static RPNExpressionBuilder calculateExpression = new RPNExpressionBuilder();
    private static MyRPNBuilder calculateExpression = new MyRPNBuilder();

    public static void main(String[] args) throws Exception {
        String templateExpression = calculateExpression.readExpression();
//        templateExpression = calculateExpression.convertToRPN(templateExpression);
        String[] temp = calculateExpression.convertToRPN(templateExpression);
        System.out.println(temp);

//        double calculatedValue = calculateExpression.calculate(templateExpression);
//        if ((calculatedValue % 1) == 0) {
//            System.out.println((int) calculatedValue);
//        } else {
//            System.out.println(calculatedValue);
//        }
    }
}
