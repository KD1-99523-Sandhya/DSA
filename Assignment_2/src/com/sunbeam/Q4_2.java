
package com.sunbeam;

import java.util.Scanner;
import java.util.Stack;

public class Q4_2 	{

    public static int evaluate(String exp) {
        Stack<Integer> st = new Stack<>();

        String tokens[] = exp.split("\\s+");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (token.equals("+") || token.equals("-")
                    || token.equals("*") || token.equals("/")) {

                int op1 = st.pop();
                int op2 = st.pop();

                int result = 0;

                switch (token) {
                case "+":
                    result = op1 + op2;
                    break;

                case "-":
                    result = op1 - op2;
                    break;

                case "*":
                    result = op1 * op2;
                    break;

                case "/":
                    result = op1 / op2;
                    break;
                }

                st.push(result);
            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter prefix expression:");
        String exp = sc.nextLine();

        System.out.println("Result = " + evaluate(exp));

        sc.close();
    }
}
