package Tasca4.S1_T04_n2exercici1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class StringLength {

    public static Matcher<String> length(Matcher<? super Integer> stringLength) {
        return new FeatureMatcher<String, Integer>(stringLength, "the String length", "length") {
            @Override
            protected Integer featureValueOf(String string) {
                return string.length();
            }
        };
    }

    public static Matcher<String> equalToIgnoringCase(Matcher<? super Boolean> matcher) {
        return new FeatureMatcher<String, Boolean>(matcher, "the String equals Aragon", "equals") {
            @Override
            protected Boolean featureValueOf(String string) {
                return string.equalsIgnoreCase("Aragon");
            }
        };
    }
}
