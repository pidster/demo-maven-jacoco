package org.pidster.foo;

import java.util.HashSet;
import java.util.Set;

public class Foo {

    private final Set<Bar> barSet = new HashSet<>();

    public Foo() {
        super();
    }

    public void add(Bar bar) {
        barSet.add(bar);
    }

    public boolean contains(Bar bar) {
        return barSet.contains(bar);
    }
}
