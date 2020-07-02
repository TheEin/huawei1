package org.test.longest_string;

import java.util.HashSet;
import java.util.Set;

public class LongestStringProcessor {

    public CharSequence process(CharSequence input) {
        Set<Character> charset = new HashSet<>();
        int start = 0;
        CharSequence result = null;
        int i = 0;
        for (; i < input.length(); ++i) {
            char c = input.charAt(i);
            if (!charset.add(c)) {
                CharSequence subsequence = input.subSequence(start, i);
                if (result == null || result.length() < subsequence.length()) {
                    result = subsequence;
                }
                while (true) {
                    char r = input.charAt(start++);
                    if (r == c) {
                        break;
                    }
                    charset.remove(r);
                }
            }
        }
        CharSequence subsequence = input.subSequence(start, i);
        if (result == null || result.length() < subsequence.length()) {
            result = subsequence;
        }
        return result;
    }
}
