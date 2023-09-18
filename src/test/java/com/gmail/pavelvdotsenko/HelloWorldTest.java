package com.gmail.pavelvdotsenko;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    void testGreeting() {
        assertThat(new HelloWorld().greeting("Pavel")).isEqualTo("Good morning Pavel!");
    }

}