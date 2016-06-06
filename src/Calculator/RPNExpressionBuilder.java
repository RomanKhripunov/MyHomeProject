package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class RPNExpressionBuilder {

    private static boolean isOperator(char c) {
        switch (c) {
            case '-':
            case '+':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }

    private static byte operatorPriority(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return 0;
    }

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

    public String convertToRPN(String expression) throws Exception {
        StringBuilder operatorsString = new StringBuilder("");
        StringBuilder resultString = new StringBuilder("");
        StringBuilder cosOperator = new StringBuilder();
        char charInput;
        char tempBracket;

        for (int i = 0; i < expression.length(); i++) {
            charInput = expression.charAt(i);
            if (isOperator(charInput)) {
                appendOperator(operatorsString, resultString, charInput);
            } else if ('(' == charInput) {
                operatorsString.append(charInput);
            } else if (')' == charInput) {
                tempBracket = operatorsString.substring(operatorsString.length() - 1).charAt(0);
                while ('(' != tempBracket) {
                    if (operatorsString.length() < 1) {
                        throw new Exception("Ошибка разбора скобок. Проверьте правильность выражения.");
                    }
                    resultString.append(" ").append(tempBracket);
                    operatorsString.setLength(operatorsString.length() - 1);
                    tempBracket = operatorsString.substring(operatorsString.length() - 1).charAt(0);
                }
                operatorsString.setLength(operatorsString.length() - 1);
            } else if ('c' == charInput) {

            } else {
                resultString.append(charInput);
            }
        }

        while (operatorsString.length() > 0) {
            resultString.append(" ").append(operatorsString.substring(operatorsString.length() - 1));
            operatorsString.setLength(operatorsString.length() - 1);
        }

        return resultString.toString();
    }

    private void appendOperator(StringBuilder tempStack, StringBuilder resultString, char charInput) {
        char charTmp;
        while (tempStack.length() > 0) {
            charTmp = tempStack.substring(tempStack.length() - 1).charAt(0);

            if (isOperator(charTmp) && (operatorPriority(charInput) <= operatorPriority(charTmp))) {
                resultString.append(" ").append(charTmp).append(" ");
                tempStack.setLength(tempStack.length() - 1);
            } else {
                resultString.append(" ");
                break;
            }
        }
        resultString.append(" ");
        tempStack.append(charInput);
    }

    public double calculate(String inputString) throws Exception {
        double firstNumber = 0, secondNumber = 0;
        String tempString;
        Deque<Double> stack = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(inputString);
        while (st.hasMoreTokens()) {
            try {
                tempString = st.nextToken().trim();
                if (1 == tempString.length() && isOperator(tempString.charAt(0))) {
                    if (stack.size() < 2) {
                        throw new Exception("Неверное количество данных в стеке для операции " + tempString);
                    }
                    secondNumber = stack.pop();
                    firstNumber = stack.pop();
                    switch (tempString.charAt(0)) {
                        case '+':
                            firstNumber += secondNumber;
                            break;
                        case '-':
                            firstNumber -= secondNumber;
                            break;
                        case '/':
                            firstNumber /= secondNumber;
                            break;
                        case '*':
                            firstNumber *= secondNumber;
                            break;
                        case '%':
                            firstNumber %= secondNumber;
                            break;
                        case '^':
                            firstNumber = Math.pow(firstNumber, secondNumber);
                            break;
                        default:
                            throw new Exception("Недопустимая операция " + tempString);
                    }
                    stack.push(firstNumber);
                } else {
                    firstNumber = Double.parseDouble(tempString);
                    stack.push(firstNumber);
                }
            } catch (Exception e) {
                throw new Exception("Недопустимый символ в выражении");
            }
        }

        if (stack.size() > 1) {
            throw new Exception("Количество о   ператоров не соответствует количеству операндов");
        }

        return stack.pop();
    }
}
