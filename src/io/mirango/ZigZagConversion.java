package io.mirango;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        // Zig is the same as the number of rows
        // Each zag is only the space between each zig (n - 2)
        int zig = numRows;
        int zag = numRows - 2;
        int zigzag = zig + zag;

        StringBuilder n = new StringBuilder();

        int size = s.length();

        // cover any edge cases
        if (size == 0 || size == 1) {
            return s;
        }
        if (numRows == 1) {
            return s;
        }
        if (size <= numRows) {
            return s;
        }

        for(int x = 0; x < zig; x++) {
            int position = x;
            int left = zigzag - (x * 2);
            int right = zigzag - left;
            n.append(s.charAt(position));
            for(int j = 0; position < s.length(); j++) {
                if (position < 0 || position > s.length()) {
                    break;
                }
                // update position
                position += left;
                if(position < s.length() && left != 0) {
                    n.append(s.charAt(position));
                }
                // update position
                position += right;
                if(position < s.length() && right != 0) {
                    n.append(s.charAt(position));
                }
            }
        }
        return n.toString();
    }
}
