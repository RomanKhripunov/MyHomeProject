package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class RPNExpressionBuilder {

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

    public String convertExpressionToRPN(String expression) throws Exception {
        StringBuilder sbStack = new StringBuilder("");
        StringBuilder resultString = new StringBuilder("");
        char charInput;
        char charTmp;

        for (int i = 0; i < expression.length(); i++) {
            charInput = expression.charAt(i);
            if (isOperator(charInput)) {
                while (sbStack.length() > 0) {
                    charTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
                    if (isOperator(charTmp) && (operatorPriority(charInput) <= operatorPriority(charTmp))) {
                        resultString.append(" ").append(charTmp).append(" ");
                        sbStack.setLength(sbStack.length() - 1);
                    } else {
                        resultString.append(" ");
                        break;
                    }
                }
                resultString.append(" ");
                sbStack.append(charInput);
            } else if ('(' == charInput) {
                sbStack.append(charInput);
            } else if (')' == charInput) {
                charTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
                while ('(' != charTmp) {
                    if (sbStack.length() < 1) {
                        throw new Exception("Ошибка разбора скобок. Проверьте правильность выражения.");
                    }
                    resultString.append(" ").append(charTmp);
                    sbStack.setLength(sbStack.length() - 1);
                    charTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
                }
                sbStack.setLength(sbStack.length() - 1);
            } else {
                resultString.append(charInput);
            }
        }

        while (sbStack.length() > 0) {
            resultString.append(" ").append(sbStack.substring(sbStack.length() - 1));
            sbStack.setLength(sbStack.length() - 1);
        }

        return resultString.toString();
    }

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
        }
        return 1;
    }

    public double calculate(String inputString) throws Exception {
        double firstNumber = 0, secondNumber = 0;
        String tempString;
        Deque<Double> stack = new ArrayDeque<Double>();
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
            throw new Exception("Количество операторов не соответствует количеству операндов");
        }

        return stack.pop();
    }
}
