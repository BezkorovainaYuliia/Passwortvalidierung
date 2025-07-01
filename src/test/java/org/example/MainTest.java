package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({"Qwertyhj, false",
            "qwer3Er345, true",
            "123456788, true",
            "qaedf$%^ghh, false"})
    void istZiffern(String password, boolean expected) {
        assertEquals(expected, Main.isNummers(password));
    }

    @ParameterizedTest
    @CsvSource({"Qwertyhj, true",
            "qwer3Er345, true",
            "123456788, false",
            "qaedf$%^ghh, false",
            "QWERRT123456, false",
            "wqertyu1223dfgh, false",
            "QWERTasdWERTdfg, true"})
    void istBuchstabe(String password, boolean expected) {
        assertEquals(expected, Main.isAlphabet(password));
    }

    @ParameterizedTest
    @CsvSource({"qwerty, true",
            "1234567890, true",
            "password, true",
            "qaedf$%^ghh, false",
            "qwerty, true",
            "wqertyu1223dfgh, false",
            "00000000, true",
            "passwort1, true",
            "PASSWORD, true",
            "q1w2e3r4t5y, true",
            "qa23ed56$rfh98, false"})
    void istSchwachPassword(String password, boolean expected) {
        assertEquals(expected, Main.isBadPassword(password));
    }

    @ParameterizedTest
    @CsvSource({"qwerty, false",
            "1234567890, false",
            "password$, true",
            "qaedf$%^ghh, true",
            "@qwerty, true",
            "wqertyu1223dfgh, false",
            "0000_0000, false",
            "pass wort1, true",
            "PASSWORD, false",
            "q1w2e3r4t5y, false",
            "qa23ed56$rfh98, true"})
    void istBesondereZeichen(String password, boolean expected) {
        assertEquals(expected, Main.isSpecialCharacters(password));
    }
}