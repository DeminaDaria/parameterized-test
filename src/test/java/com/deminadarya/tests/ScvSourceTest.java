package com.deminadarya.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ScvSourceTest extends TestBase {

    @CsvSource(value = {
            "Вася, 123",
            "Борв, 321"
    })
    @ParameterizedTest
    void fillNameCsvTest(String name, int age) {
        registrationFormPage.typeFirstName(name + age);
    }
}
