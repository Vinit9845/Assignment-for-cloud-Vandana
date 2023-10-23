  
import java.util.*;

 class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();
        int decimal = 0;
        int lastNumber = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            char ch = roman.charAt(i);
            int number = romanToDecimal(ch);
            if (number < lastNumber) {
                decimal -= number;
            } else {
                decimal += number;
            }
            lastNumber = number;
        }
        System.out.println("The integer value of " + roman + " is " + decimal);
    }

    public static int romanToDecimal(char ch) {
        if (ch == 'I') {
            return 1;
        } else if (ch == 'V') {
            return 5;
        } else if (ch == 'X') {
            return 10;
        } else if (ch == 'L') {
            return 50;
        } else if (ch == 'C') {
            return 100;
        } else if (ch == 'D') {
            return 500;
        } else if (ch == 'M') {
            return 1000;
        }
        return -1;
    }
}
