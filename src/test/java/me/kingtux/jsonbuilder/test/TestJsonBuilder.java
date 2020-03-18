package me.kingtux.jsonbuilder.test;

import me.kingtux.jsonbuilder.JsonArrayBuilder;
import me.kingtux.jsonbuilder.JsonBuilder;
import me.kingtux.jsonbuilder.JsonObjectBuilder;
import org.junit.jupiter.api.Test;

public class TestJsonBuilder {
    @Test
    public void test() {
        System.out.println(new JsonObjectBuilder().add("potato", "potato").
                add("me", new JsonObjectBuilder().add("three", "four").
                        add("me", new JsonArrayBuilder().add("one").add("two").add(new JsonObjectBuilder().add("three", "three")))).buildString());
    }
}
