package Calculator;

public class StringConverter {

    public static void main(String[] args) throws Exception {
        RPNExpressionBuilder reader = new RPNExpressionBuilder();
        String templateExpression = reader.readExpression();
//        System.out.println(templateExpression);
//        System.out.println(Arrays.toString(reader.convertExpToSymbol(templateExpression)));
        templateExpression = reader.convertExpressionToRPN(templateExpression);
        System.out.println(reader.calculate(templateExpression));
    }
}
