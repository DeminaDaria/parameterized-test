package com.deminadarya.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourceTest extends TestBase {

    @Test
    void fillFormTest() {
        registrationFormPage.typeFirstName(testData.getFirstName());
        registrationFormPage.typeLastName(testData.getLastName());
        registrationFormPage.typeEmail(testData.getUserEmail());
        registrationFormPage.genderChose(testData.getGender());
        registrationFormPage.typeNumber(testData.getUserNumber());
        registrationFormPage.typeSubject(testData.getSubject());
        registrationFormPage.typeHobby(testData.getHobby());
        registrationFormPage.typeAddress(testData.getCurrentAddress());
        registrationFormPage.typeStateCity(testData.getState(), testData.getCity());
        registrationFormPage.sendForm();
    }

    @ValueSource(strings = {
            "Вася", "Петя"
    })
    @ParameterizedTest(name = "Заполнение имени")
    void fillNameTest(String name) {
        registrationFormPage.typeFirstName(name);
    }
}