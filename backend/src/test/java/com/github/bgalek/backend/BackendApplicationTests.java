package com.github.bgalek.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void simpleTest() throws InterruptedException {
        Thread.sleep(1000);
        assertEquals(2 + 2, 4);
    }

}
