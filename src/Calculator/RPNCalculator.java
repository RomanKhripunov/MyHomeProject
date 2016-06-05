package Calculator;

import java.util.Stack;

public class RPNCalculator {

    /** Calculate a RPN expression
     *
     * @param expressionInRPN - expression in RPN format
     * @return resultValue - result of calculation
     */
    public int calculateRPN(String[] expressionInRPN) {
        int resultValue = 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<>();

        for (String elementOfExpression : expressionInRPN) {
            if (!operators.contains(elementOfExpression)) {
                stack.push(elementOfExpression);
            } else {
                int firstNumber = Integer.valueOf(stack.pop());
                int secondNumber = Integer.valueOf(stack.pop());

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

        resultValue = Integer.valueOf(stack.pop());
        return resultValue;
    }
}
