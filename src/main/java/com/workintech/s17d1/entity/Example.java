package com.workintech.s17d1.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Example {
    @Value("${example.Int}")
    private int intValue;
    public int getIntValue() {
        return intValue;
    }

    public static void main(String[] args) {
        new Example();
        System.out.println(new Example().getIntValue());
    }
}
