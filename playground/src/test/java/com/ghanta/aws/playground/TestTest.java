package com.ghanta.aws.playground;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class TestTest {

    @InjectMocks
    private ReverseString reverseString;

    @Test
    public void testReverseString() {
        String input = "hello";
        String expected = "olleh";
        String actual = reverseString.reverseString(input);
        assert expected.equals(actual) : "Expected " + expected + " but got " + actual;
    }

    @Test
    public void testReverseString_NullInput() {
        String input = null;
        String actual = reverseString.reverseString(input);
        assert actual == null : "Expected null but got " + actual;
    }
        
}
