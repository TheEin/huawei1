package org.test;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.test.longest_string.LongestStringProcessor;

@Slf4j
public class App {

    private static final String[] INPUT_STRINGS = {
            "abcabcbb",
            "abcadbcbb",
            "abcdefgh",
            "bbbbb",
            "pwwkew",
            "plensunbypivaskerlik",
            RandomStringUtils.randomAlphabetic(100).toLowerCase(),
            RandomStringUtils.randomAlphabetic(1000000).toLowerCase()
    };

    public static void main(String[] args) {
        LongestStringProcessor processor = new LongestStringProcessor();
        for (String inputString : INPUT_STRINGS) {
            log.info("Next input string:\n{}", inputString);
            CharSequence longestString = processor.process(inputString);
            log.info("Longest substring:\n{}", longestString);
        }
        System.exit(0);
    }

}
