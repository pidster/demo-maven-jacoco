package org.pidster.foo;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FooTests {

    @Test
    public void test() {

        Bar bar = new Bar(Instant.now());

        Foo foo = new Foo();
        foo.add(bar);

        assertTrue(foo.contains(bar));
    }

}
