package pr_22;

public class RPNCalculator {

    public double calculate(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            throw new IllegalArgumentException("Выражение пустое");
        }

        Stack stack = new Stack();
        String[] tokens = expression.trim().split("\\s+");

        for (String token : tokens) {

            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {

                if (stack.count() < 2) {
                    throw new IllegalStateException(
                            "Невозможно выполнить POP"
                    );
                }

                double b = stack.pop();
                double a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;

                    case "-":
                        stack.push(a - b);
                        break;

                    case "*":
                        stack.push(a * b);
                        break;

                    case "/":
                        if (b == 0) {
                            throw new ArithmeticException("Деление на ноль");
                        }
                        stack.push(a / b);
                        break;
                }

            } else {
                throw new IllegalArgumentException(
                        "Неизвестный элемент: " + token
                );
            }
        }

        if (stack.count() != 1) {
            throw new IllegalArgumentException(
                    "Некорректное выражение: в стеке осталось " + stack.count() + " элемента"
            );
        }

        return stack.pop();
    }

    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isOperator(String token) {
        return token.equals("+")
                || token.equals("-")
                || token.equals("*")
                || token.equals("/");
    }
}