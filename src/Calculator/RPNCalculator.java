package Calculator;

import java.util.Stack;

public class RPNCalculator {

    /** Calculate a RPN expression
     *
     * @param expressionInRPN - expression in RPN format
     * @return resultValue - result of calculation
     */
    public double calculateRPN(String[] expressionInRPN) {
        double resultValue = 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<>();

        for (String elementOfExpression : expressionInRPN) {
            if (!operators.contains(elementOfExpression)) {
                stack.push(elementOfExpression);
            } else {
                double firstNumber = Double.valueOf(stack.pop());
                double secondNumber = Double.valueOf(stack.pop());

                switch (elementOfExpression) {
                    case "+":
                        stack.push(String.valueOf(firstNumber + secondNumber));
                        break;
                    case "-":
                        stack.push(String.valueOf(firstNumber - secondNumber));
                        break;
                    case "*":
                        stack.push(String.valueOf(firstNumber * secondNumber));
                        break;
                    case "/":
                        stack.push(String.valueOf(firstNumber / secondNumber));
                        break;
                }
            }
        }

        resultValue = Double.valueOf(stack.pop());
        return resultValue;
    }
}
