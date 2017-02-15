package io.mirango;

public class MyAtoi {
    public static int myAtoi(String str) {
        boolean positive = true;
        int number = 0;
        int x = 0;

        str = str.trim();
        int size = str.length();
        if (size < 1) {
            return 0;
        }

        switch (str.charAt(0)) {
            case '-':
                positive = false;
                x++;
                break;
            case '+':
                x++;
                break;
        }

        while(x < size) {
            char current = str.charAt(x);
            if((current >= '0') && (current <= '9')) {
                try {
                    number = Math.multiplyExact(number, 10);
                    number = Math.addExact(number, (current - '0'));
                } catch (ArithmeticException e) {
                    if (positive) {
                        return 2147483647;
                    } else {
                        return -2147483648;
                    }
                }
            } else {
                break;
            }
            x++;
        }

        if (positive) {
            return number;
        } else {
            return -1 * number;
        }
    }
}
