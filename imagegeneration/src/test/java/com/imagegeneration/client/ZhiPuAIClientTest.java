package com.imagegeneration.client;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static com.imagegeneration.client.Utilities.saveBase64Image;
import static com.imagegeneration.client.Utilities.testValidBase64Image;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("zhipuai")
public class ZhiPuAIClientTest {

    //  TODO-10: Use the @Autowired annotation to inject an instance of our AIClient.
    @Autowired
    AIClient client;

    //  TODO-11: Define a new test method to test the client's createImageB64 method.
    //  Pass in whatever image description you like.
    //  Use assertThat() to ensure that the returned Base-64 encoded String is not blank.
    //  Call the provided testValidBase64Image() method to check that the returned string appears to be a valid image.
    //  Call the provided saveBase64Image() to save a copy of your image.
    @Test
    @Disabled
    public void testCreateImageB64() {
        String imageB64 = client.createImageB64("Crescent moon over the Shanghai skyline.");
        assertThat(imageB64).isNotBlank();
        testValidBase64Image(imageB64);
        saveBase64Image(imageB64, "lab-image.png");
    }

}