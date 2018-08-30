package org.pidster.foo;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BarTests {

    @Test
    public void test() {

        Bar bar = new Bar(Instant.now());
        assertNotNull(bar);

    }

}
