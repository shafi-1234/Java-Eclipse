
public class Main {

    static int index = 0;

    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decode(s));
    }

    static String decode(String s) {

        StringBuilder result = new StringBuilder();

        while (index < s.length() && s.charAt(index) != ']') {

            if (Character.isDigit(s.charAt(index))) {

                int num = 0;
                while (Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }

                index++; 

                String decoded = decode(s);

                index++; 

                while (num-- > 0)
                    result.append(decoded);

            } else {
                result.append(s.charAt(index));
                index++;
            }
        }

        return result.toString();
    }
}