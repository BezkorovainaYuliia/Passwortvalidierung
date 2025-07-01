package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.example.Main.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
  @ParameterizedTest
    @CsvSource({"Qwertyu, false",
            "Qwertyui12, true",
            "1234567, false",
            "A1S2d3F4f5, true"})
   void istPasswordMindenstens8Zeichen(String password, boolean expected) {
        assertEquals(expected, Main.isPasswordLong(password));
    }

}