package com.mehdi.test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloControllerTests {

    @Test
    void testIndex() {
        HelloController helloController = new HelloController();

        String resultIndex = helloController.index();

        assertThat(resultIndex).isEqualTo("salut John Doe");
    }
}
