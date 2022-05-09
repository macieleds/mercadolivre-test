package com.desafio.payment.integration;

import com.desafio.payment.controller.PaymentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = PaymentController.class)
@AutoConfigureMockMvc
@EnableWebMvc
class PaymentOperationsControllerTest {

    private static final String PAYMENT_VALIDATION_ENDPOINT = "/payers";

    @Autowired
    private MockMvc mockMvc;


    @Test
    @SuppressWarnings("ConstantConditions")
    void shouldReturnOkWhenCallingPasswordValidationEndpointWithPasswordPayload() throws Exception {
        final var createTransactionRequestSpec = getClass()
                .getClassLoader()
                .getResourceAsStream("")
                .readAllBytes();

        mockMvc.perform(post(PAYMENT_VALIDATION_ENDPOINT)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(createTransactionRequestSpec))
                .andExpect(status().isOk());
    }

}
