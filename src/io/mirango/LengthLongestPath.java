package io.mirango;

import java.util.Stack;

public class LengthLongestPath {
    public static int lengthLongestPath(String input) {
        Stack<Integer> s = new Stack<>();
        int current = 0;
        int count = 0;
        int longest = 0;
        int depth = 0;
        int oldDepth;

        for (int x = 0; x < input.length(); x++) {
            if (input.charAt(x) == '\n') {
                oldDepth = depth;
                depth = 0;

                x++;
                while (input.charAt(x) == '\t') {
                    x++;
                    depth++;
                }
                x--;

                if (depth > oldDepth) {
                    count += current + 1;
                    s.push(current);
                } else {
                    while (oldDepth > depth) {
                        oldDepth--;
                        int t = s.pop();
                        count -= (t + 1);
                    }
                }
                current = 0;
            }
            else if (input.charAt(x) == '.') {
                s.push(current);
                count += current + 1;
                current = 0;

                x++;
                while (x < input.length() && input.charAt(x) != '\n') {
                    current++;
                    x++;
                }
                x--;

                count += current;
                if (count > longest) {
                    longest = count;
                }

                count -= current;
                int t = s.pop();
                count -= (t + 1);
                current = 0;
            }
            else {
                current++;
            }
        }
        return longest;
    }
}
