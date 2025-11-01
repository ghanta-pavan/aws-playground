package com.ghanta.aws.playground;

import org.springframework.stereotype.Service;

@Service
public class ReverseString {
    public String reverseString(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
}
