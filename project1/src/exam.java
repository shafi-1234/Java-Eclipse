import java.util.Scanner;

import java.util.Stack;

public class exam {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String curr = "";
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(num);
                stringStack.push(curr);
                num = 0;
                curr = "";
            }
            else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder temp = new StringBuilder(stringStack.pop());

                for (int i = 0; i < repeat; i++) {
                    temp.append(curr);
                }

                curr = temp.toString();
            }
            else {
                curr += ch;
            }
        }

        return curr;
    }
}