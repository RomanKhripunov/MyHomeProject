package Calculator;

public class StringConverter {

    public static void main(String[] args) {
        RPNExpressionBuilder reader = new RPNExpressionBuilder();
        String templateExpression = reader.readExpression();
//        System.out.println(templateExpression);
//        System.out.println(Arrays.toString(reader.convertExpToSymbol(templateExpression)));
        System.out.println(reader.convertExpressionToSymbol(templateExpression));
    }
}
