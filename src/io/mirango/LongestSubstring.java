package io.mirango;

import java.util.concurrent.*;

// Queue based solution
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        ConcurrentLinkedQueue<Character> l = new ConcurrentLinkedQueue<>();
        int current = 0;
        int longest = 0;

        for(int x = 0; x < s.length(); x++) {
            if(l.contains(s.charAt(x))) {
                if(current > longest) {
                    longest = current;
                }
                while(l.poll() != s.charAt(x)){
                    current--;
                }
                current--;
            }
            current++;
            l.add(s.charAt(x));
        }

        if(current > longest) {
            return current;
        } else {
            return longest;
        }
    }
}