package com.deminadarya.tests;

import com.codeborne.selenide.Configuration;
import com.deminadarya.domain.TestData;
import com.deminadarya.pages.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    TestData testData = new TestData();
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @BeforeEach
    void setUp() {
        testData.fillTestData();
        registrationFormPage.openPage();
    }

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1450х950";
        Configuration.holdBrowserOpen = true;
        Configuration.pageLoadTimeout = 600000;
    }
}
