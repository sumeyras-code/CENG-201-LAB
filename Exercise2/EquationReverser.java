/**
 * EquationReverser.java
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        2026-10-26
 */
public class EquationReverser {

    public static String reverseEquation(String equation) {
        TokenStack stack = new TokenStack();
        int i = 0;

        while (i < equation.length()) {
            char current = equation.charAt(i);

            if (Character.isDigit(current)) {
                int start = i;
                while (i < equation.length()
                        && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                stack.push(equation.substring(start, i));
            } else {
                stack.push(String.valueOf(current));
                i++;
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
