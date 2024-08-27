package com.jawa.creational.protoype;

import com.jawa.creational.prototype.Foo;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FooTest {

    @Test
    void test() {
        Foo foo = new Foo(32, "Onething");
        Foo roundtrip2 = SerializationUtils.roundtrip(foo);
        assertNotEquals(foo,roundtrip2);
    }
}
